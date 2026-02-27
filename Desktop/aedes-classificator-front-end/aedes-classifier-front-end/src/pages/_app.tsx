import type { AppProps } from "next/app";
import { Header } from "@/components/header";
import { Footer } from "@/components/footer";
import "@/styles/globals.css";

export default function App({ Component, pageProps }: AppProps) {
  return (
    <div className="min-h-screen flex flex-col">
      <Header />
      <main className="flex-1 flex flex-col">
        <Component {...pageProps} />
      </main>
      <Footer />
    </div>
  );
}