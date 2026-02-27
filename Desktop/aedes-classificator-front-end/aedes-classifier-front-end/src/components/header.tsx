import Link from "next/link";

export function Header() {
  return (
    <div className="bg-red-500 text-white px-6 py-4 flex items-center justify-between">
      <nav className="flex gap-4">
        <Link href="/" className="text-black">
          Home
        </Link>

        <Link href="/about" className="hover:text-sky-400">
          Sobre
        </Link>

        <Link href="/contact" className="hover:text-sky-400">
          Contato
        </Link>
      </nav>
    </div>
  );
}