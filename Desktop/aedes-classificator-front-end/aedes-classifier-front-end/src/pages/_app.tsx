import type { AppProps } from "next/app";
import { Header } from "@/components/header";
import { Footer } from "@/components/footer";
import "@/styles/globals.css";
import { useRouter } from "next/router";
import { SearchBar } from "@/components/search-bar";
import { FaFileUpload } from "react-icons/fa";
import { useRef, useState } from "react";
import { MdClose } from "react-icons/md";
import { AnimatePresence, motion } from "framer-motion";

export default function App({ Component, pageProps }: AppProps) {
  const router = useRouter();
  const fileInputRef = useRef<HTMLInputElement>(null);

  const showSearch = ["/aedes", "/dengue", "/chikungunya", "/febreAmarela", "/zika"].includes(router.pathname);

  const [loading, setLoading] = useState(false);
  const [result, setResult] = useState<any>(null);
  const [showModal, setShowModal] = useState(false);
  const [errorSnackbar, setErrorSnackbar] = useState<string | null>(null);
  const [showDatasetOptions, setShowDatasetOptions] = useState(false);

  const handleDatasetSelect = (selected: "kaggle" | "mendelev") => {
    setShowDatasetOptions(false);
    if (fileInputRef.current) {
      fileInputRef.current.dataset.selected = selected;
      fileInputRef.current.click();
    }
  };

  const handleFileChange = async (event: React.ChangeEvent<HTMLInputElement>) => {
    const file = event.target.files?.[0];
    if (!file) return;
    const selectedDataset = event.target.dataset.selected as "kaggle" | "mendelev";
    if (!selectedDataset) {
      return;
    }

    const formData = new FormData();
    formData.append("file", file);

    try {
      setLoading(true);

      const response = await fetch(`http://127.0.0.1:8000/predict?dataset=${selectedDataset}`, {
        method: "POST",
        body: formData
      });

      const data = await response.json();
      setResult(data);
      setShowModal(true);

    } catch (error) {
      console.log("Error:", error);
      setErrorSnackbar("Erro ao classificar a imagem selecionada");
      setTimeout(() => setErrorSnackbar(null), 4000);
    } finally {
      setLoading(false);
    }
  };

  const onCloseModal = () => {
    setShowModal(false)
  }

  const onClickDatasetOption = () => {
    setShowDatasetOptions(!showDatasetOptions)
  }

  return (
    <div className="h-screen flex flex-col overflow-hidden">
      <Header />
      <div className="flex justify-end px-4 mt-2 relative">
        <div className="relative group">
          <button className="bg-blue-400 text-white p-2 rounded-full hover:bg-blue-500 duration-500" onClick={onClickDatasetOption}>
            {!showDatasetOptions ? <FaFileUpload size={20} /> : <MdClose size={20} />}
          </button>
          {!showDatasetOptions &&
            <span className="absolute -right-2 bottom-10 mt-1 scale-0 group-hover:scale-100 transition-transform bg-gray-800 text-white text-xs rounded py-1 px-2">
              Upload
            </span>
          }
          {showDatasetOptions && (
            <div className="absolute right-0 mt-2 bg-white border rounded shadow-lg z-50 whitespace-nowrap">
              <button
                className="block px-4 py-2 hover:bg-blue-100 w-full text-left font-semibold"
                onClick={() => handleDatasetSelect("kaggle")}
              >
                Aedes Mosquitos Dataset
              </button>
              <button
                className="block px-4 py-2 hover:bg-blue-100 w-full text-left font-semibold"
                onClick={() => handleDatasetSelect("mendelev")}
              >
                Dataset of Vector Mosquito Images Mendeley
              </button>
            </div>
          )}
          <input
            type="file"
            ref={fileInputRef}
            onChange={handleFileChange}
            className="hidden"
            accept="image/*"
          />
        </div>
      </div>
      {showSearch && <SearchBar />}
      <div className="flex-1 flex flex-col">
        <Component {...pageProps} />
      </div>
      <Footer />
      {loading && (
        <div className="fixed inset-0 bg-black/60 flex items-center justify-center z-50">
          <div className="flex flex-col items-center space-y-4">
            <div className="w-14 h-14 border-4 border-white border-t-transparent rounded-full animate-spin"></div>
            <p className="text-white text-lg">Analisando imagem...</p>
          </div>
        </div>
      )}
      {showModal && (
        <div className="fixed inset-0 bg-black/60 flex items-center justify-center z-50">
          <div className="bg-white rounded-lg p-6 w-[500px] text-center shadow-xl flex flex-col space-y-6">
            <h2 className="text-xl font-bold">
              Resultado da classificação para <em>Aedes aegypti</em>
            </h2>
            <p className="text-2xl font-semibold">
              {result.probability + '%'}
            </p>
            <button
              className="hover:underline" onClick={onCloseModal}
            >
              Fechar
            </button>
          </div>
        </div>
      )}
      <AnimatePresence>
        {errorSnackbar && (
          <motion.div
            initial={{ opacity: 0, x: 300 }}
            animate={{ opacity: 1, x: 0 }}
            exit={{ opacity: 0, x: 300 }}
            transition={{ duration: 0.5 }}
            className="fixed top-5 right-5 px-6 py-2 rounded shadow-lg text-white bg-red-500 z-50"
          >
            {errorSnackbar}
          </motion.div>
        )}
      </AnimatePresence>
    </div>
  );
}