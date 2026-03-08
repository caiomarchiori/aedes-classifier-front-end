import type { AppProps } from "next/app";
import { Header } from "@/components/header";
import { Footer } from "@/components/footer";
import "@/styles/globals.css";
import { useRouter } from "next/router";
import { SearchBar } from "@/components/search-bar";

export default function App({ Component, pageProps }: AppProps) {
  const router = useRouter();
  const showSearch = ["/aedes", "/dengue", "/chikungunya", "/febreAmarela", "/zika"].includes(router.pathname);

  return (
    <div className="min-h-screen flex flex-col">
      <Header />
      {showSearch && <SearchBar />}
      <main className="flex-1 flex flex-col">
        <Component {...pageProps} />
      </main>
      <Footer />
    </div>
  );
}