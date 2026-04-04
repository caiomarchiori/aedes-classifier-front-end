"use client";
import { motion } from "framer-motion";
import { FaLinkedin, FaFacebook, FaInstagram, FaYoutube } from "react-icons/fa";

export function Footer() {

  const navLinks = [
    { label: "LinkedIn", href: "https://www.linkedin.com/in/caio-marchiori-808994263", icon: FaLinkedin },
    { label: "Facebook", href: "https://web.facebook.com/minsaude?_rdc=1&_rdr#", icon: FaFacebook },
    { label: "Instagram", href: "https://www.instagram.com/minsaude", icon: FaInstagram },
    { label: "YouTube", href: "https://www.youtube.com/minsaudebr", icon: FaYoutube }
  ];

  return (
    <div className="w-full bg-[#2F7AF0] rounded-sm pl-12 py-4 flex items-center space-x-10 font-semibold">

      <motion.p
        className="text-white"
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        transition={{ duration: 0.8 }}
      >
        Redes Sociais
      </motion.p>

      <motion.div
        className="w-0.5 h-10 bg-[#E2E2E2]"
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        transition={{ duration: 0.8, delay: 0.2 }}
      />

      <div className="flex items-center space-x-12 text-white font-semibold">

        {navLinks.map((link, index) => {
          const Icon = link.icon;

          return (
            <motion.div
              key={link.label}
              initial={{ opacity: 0, y: 20 }}
              animate={{ opacity: 1, y: 0 }}
              transition={{
                duration: 0.8,
                delay: 0.4 + index * 0.2,
              }}
              className="flex items-center space-x-2 transition-colors hover:text-blue-200"
            >
              <div className="rounded-full p-1 bg-blue-600">
                <Icon size={20} />
              </div>

              <a
                href={link.href}
                target="_blank"
                rel="noopener noreferrer"
              >
                {link.label}
              </a>
            </motion.div>
          );
        })}

      </div>

      <motion.div
        className="w-0.5 h-12 bg-[#E2E2E2]"
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        transition={{ duration: 0.8, delay: 0.3 }}
      />

      <motion.p
        className="text-white"
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        transition={{ duration: 0.8, delay: 0.5 }}
      >
        Desenvolvido por - Caio Rabottini Marchiori @2026
      </motion.p>

    </div>
  );
}