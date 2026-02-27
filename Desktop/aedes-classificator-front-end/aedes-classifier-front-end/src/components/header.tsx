"use client";

import Link from "next/link";
import { usePathname } from "next/navigation";

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

        {/* LOGO */}
        <div className="flex items-center gap-3">
          <div className="w-8 h-8 bg-blue-700 rounded-sm flex items-center justify-center text-white font-bold">
            F
          </div>
          <span className="font-semibold text-blue-900">
            CEFET/RJ
          </span>
        </div>

        {/* DIVIDER */}
        <div className="w-0.5 h-12 bg-[#E2E2E2]" />

        {/* NAVBAR */}
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

        {/* DIVIDER */}
        <div className="w-0.5 h-12 bg-[#E2E2E2]" />

        {/* LANGUAGE */}
        <div className="flex items-center space-x-4">
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