import type { AppProps } from "next/app";
import { Header } from "@/components/header";
import { Footer } from "@/components/footer";
import "@/styles/globals.css";
import { useRouter } from "next/router";
import { SearchBar } from "@/components/search-bar";
import { FaFileUpload } from "react-icons/fa";
import { useRef, useState } from "react";

export default function App({ Component, pageProps }: AppProps) {
  const router = useRouter();
  const fileInputRef = useRef<HTMLInputElement>(null);

  const showSearch = ["/aedes", "/dengue", "/chikungunya", "/febreAmarela", "/zika"].includes(router.pathname);

  const [loading, setLoading] = useState(false);
  const [result, setResult] = useState<any>(null);
  const [showModal, setShowModal] = useState(false);
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
      console.error("Erro ao enviar imagem:", error);
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
    <div className="min-h-screen flex flex-col">
      <Header />
      <div className="flex justify-end px-4 mt-2 relative">
        <div className="relative group">
          <button className="bg-blue-400 text-white p-2 rounded-full hover:bg-blue-500 duration-500" onClick={onClickDatasetOption}>
            <FaFileUpload size={20} />
          </button>
          {!showDatasetOptions &&
            <span className="absolute -right-2 bottom-10 mt-1 scale-0 group-hover:scale-100 transition-transform bg-gray-800 text-white text-xs rounded py-1 px-2">
              Upload
            </span>
          }
          {showDatasetOptions && (
            <div className="absolute right-0 mt-2 bg-white border rounded shadow-lg z-50">
              <button
                className="block px-4 py-2 hover:bg-blue-100 w-full text-left"
                onClick={() => handleDatasetSelect("kaggle")}
              >
                Kaggle
              </button>
              <button
                className="block px-4 py-2 hover:bg-blue-100 w-full text-left"
                onClick={() => handleDatasetSelect("mendelev")}
              >
                Mendelev
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
      <main className="flex-1 flex flex-col">
        <Component {...pageProps} />
      </main>
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
          <div className="bg-white rounded-lg p-6 w-[350px] text-center shadow-xl">
            <h2 className="text-xl font-bold mb-4">
              Resultado da Classificação
            </h2>
            <p className="text-lg mb-4">
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
    </div>
  );
}