"use client";
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

            <p className="text-white">Redes Sociais</p>

            <div className="w-0.5 h-10 bg-[#E2E2E2]" />

            <div className="flex items-center space-x-12 text-white font-semibold">

                {navLinks.map((link) => {
                    const Icon = link.icon;
                    return (
                        <div className="flex items-center space-x-2 transition-colors hover:text-blue-200">
                            <div className="rounded-full p-1 bg-blue-600">
                                <Icon size={20} />
                            </div>
                            <a
                                key={link.href}
                                href={link.href}
                                target="_blank"
                                rel="noopener noreferrer"
                            >
                                {link.label}
                            </a>
                        </div>
                    )
                })}

            </div>
            <div className="w-0.5 h-12 bg-[#E2E2E2]" />
            <p className="text-white">Desenvolvido por - Caio Rabottini Marchiori @2026</p>

        </div>
    );
}