"use client";

import Link from "next/link";
import { usePathname } from "next/navigation";
import Image from "next/image";
import Logo from "../assets/cefet .png"
import { MdLanguage } from "react-icons/md";

export function Header() {
  const pathname = usePathname();

  const navLinks = [
    { label: "Início", href: "/" },
    { label: "Aedes aegypti", href: "/aedes" },
    { label: "Dengue", href: "/dengue" },
    { label: "Chikungunya", href: "/chikungunya" },
    { label: "Febre Amarela", href: "/febre-amarela" },
    { label: "Zika", href: "/zika" },
  ];

  return (
    <div className="w-full border-black border-b-2 border-opacity-10 rounded-md px-32 py-4">
      <div className="flex items-center justify-between">
        <Image
          src={Logo}
          alt="Logo CEFET/RJ"
          width={150}
          height={20}
        />

        <div className="w-0.5 h-12 bg-[#E2E2E2]" />

        <nav className="flex items-center space-x-12 text-[#1351B4] font-semibold">

          {navLinks.map((link) => {
            const isActive = pathname === link.href;

            return (
              <Link
                key={link.href}
                href={link.href}
                className={`transition-colors pb-1 ${isActive ? "text-blue-400 border-b-2 border-blue-400" : "hover:text-blue-500"}`}
              >
                {link.label}
              </Link>
            );
          })}

        </nav>

        <div className="w-0.5 h-12 bg-[#E2E2E2]" />

        <div className="flex items-center space-x-4">
          <MdLanguage size={22} className="text-[#1351B4] text-opacity-50" />

          <button className="text-[#1351B4] font-bold">
            pt-br
          </button>

          <button className="text-[#1351B4]/50 font-bold hover:text-[#1351B4] transition-colors">
            en-us
          </button>
        </div>

      </div>
    </div>
  );
}