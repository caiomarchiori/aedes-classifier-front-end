"use client";

import Link from "next/link";
import { usePathname } from "next/navigation";
import Image from "next/image";
import Logo from "../assets/cefet .png";
import { MdLanguage } from "react-icons/md";
import { motion } from "framer-motion";

export function Header() {
  const pathname = usePathname();

  const navLinks = [
    { label: "Início", href: "/" },
    { label: "Aedes aegypti", href: "/aedes" },
    { label: "Dengue", href: "/dengue" },
    { label: "Chikungunya", href: "/chikungunya" },
    { label: "Febre Amarela", href: "/febreAmarela" },
    { label: "Zika", href: "/zika" },
  ];

  const fade = { opacity: 0, y: 0 };
  const fadeAnimate = { opacity: 1, y: 0 };
  const fadeTransition = { duration: 3.0 };

  return (
    <div className="w-full border-black border-b-2 border-opacity-10 rounded-md px-32 py-1">
      <div className="flex items-center justify-between">

        <motion.div
          initial={fade}
          animate={fadeAnimate}
          transition={{ ...fadeTransition, delay: 0 }}
        >
          <Image
            src={Logo}
            alt="Logo CEFET/RJ"
            width={150}
            height={20}
          />
        </motion.div>

        <motion.div
          className="w-0.5 h-12 bg-[#E2E2E2]"
          initial={fade}
          animate={fadeAnimate}
          transition={{ ...fadeTransition, delay: 0.1 }}
        />

        <nav className="flex items-center space-x-12 text-[#1351B4] font-semibold">
          {navLinks.map((link, index) => {
            const isActive = pathname === link.href;
            return (
              <motion.div
                key={link.href}
                initial={{ opacity: 0, y: 20 }}
                animate={{ opacity: 1, y: 0 }}
                transition={{
                  duration: 1,
                  delay: index * 0.2,
                }}
              >
                <Link
                  href={link.href}
                  className={`transition-colors pb-1 ${
                    isActive
                      ? "text-blue-400 border-b-2 border-blue-400"
                      : "hover:text-blue-500"
                  }`}
                >
                  {link.label}
                </Link>
              </motion.div>
            );
          })}
        </nav>

        <motion.div
          className="w-0.5 h-12 bg-[#E2E2E2]"
          initial={fade}
          animate={fadeAnimate}
          transition={{ ...fadeTransition, delay: 0.2 }}
        />

        <motion.div
          className="flex items-center space-x-4"
          initial={fade}
          animate={fadeAnimate}
          transition={{ ...fadeTransition, delay: 0.3 }}
        >
          <MdLanguage size={22} className="text-[#1351B4] text-opacity-50" />
          <p className="text-[#1351B4] font-bold">
            pt-br
          </p>
        </motion.div>

      </div>
    </div>
  );
}