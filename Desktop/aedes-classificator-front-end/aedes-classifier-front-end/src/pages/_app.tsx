import type { AppProps } from "next/app";
import { Header } from "@/components/header";
import { Footer } from "@/components/footer";
import "@/styles/globals.css";
import { useRouter } from "next/router";
import { SearchBar } from "@/components/search-bar";
import { FaFileUpload } from "react-icons/fa";

export default function App({ Component, pageProps }: AppProps) {
  const router = useRouter();
  const showSearch = ["/aedes", "/dengue", "/chikungunya", "/febreAmarela", "/zika"].includes(router.pathname);

  const onClick = () => {
    console.log("Click")
  }

  return (
    <div className="min-h-screen flex flex-col">
      <Header />
      <div className="flex justify-end px-4 mt-2">
        <div className="relative group">
          <button className="bg-blue-400 text-white p-2 rounded-full hover:bg-blue-500 duration-500" onClick={onClick}>
            <FaFileUpload size={20} />
          </button>
          <span className="absolute -right-2 bottom-10 mt-1 scale-0 group-hover:scale-100 transition-transform bg-gray-800 text-white text-xs rounded py-1 px-2">
            Upload
          </span>
        </div>
      </div>
      {showSearch && <SearchBar />}
      <main className="flex-1 flex flex-col">
        <Component {...pageProps} />
      </main>
      <Footer />
    </div>
  );
}