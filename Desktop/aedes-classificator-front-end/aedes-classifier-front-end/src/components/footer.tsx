"use client";

export function Footer() {

    const navLinks = [
        { label: "LinkedIn", href: "https://www.linkedin.com" },
        { label: "Facebook", href: "https://www.facebook.com" },
        { label: "Instagram", href: "https://www.instagram.com" },
        { label: "Twitter", href: "https://www.twitter.com" },
        { label: "YouTube", href: "https://www.youtube.com" }
    ];


    return (
        <div className="w-full bg-[#2F7AF0] rounded-sm px-12 py-4 flex items-center justify-between font-semibold">

            <p className="text-white">Redes Sociais</p>

            <div className="w-0.5 h-12 bg-[#E2E2E2]" />

            <div className="flex items-center space-x-12 text-white font-semibold">

                {navLinks.map((link) => (
                    <a
                        key={link.href}
                        href={link.href}
                        target="_blank"
                        rel="noopener noreferrer"
                        className="transition-colors hover:text-blue-200"
                    >
                        {link.label}
                    </a>
                ))}

            </div>
            <div className="w-0.5 h-12 bg-[#E2E2E2]" />
            <p className="text-white">Desenvolvido por - Caio Rabottini Marchiori @2026</p>

        </div>
    );
}