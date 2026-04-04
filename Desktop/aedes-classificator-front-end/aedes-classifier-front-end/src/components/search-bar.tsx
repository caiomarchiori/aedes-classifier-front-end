"use client";

import { usePathname } from "next/navigation";
import { CiSearch } from "react-icons/ci";

const labels = {
    aedes: "Aedes aegypti",
    zika: "Zika",
    dengue: "Dengue",
    febreAmarela: "Febre Amarela",
    chikungunya: "Chikungunya"
};

type LabelKey = keyof typeof labels;

export function SearchBar() {

    const pathname = usePathname();
    const key = pathname.replace("/", "") as LabelKey;
    const value = labels[key];

    return (
        <div className="flex justify-center mt-8">
            <div className="relative w-[600px]">
                <input
                    type="text"
                    value={value}
                    className="bg-white w-full rounded-lg border border-b-2 border-blue-400/70 py-2 px-10 text-center text-blue-600"
                    disabled
                />
                <CiSearch size={22} className="absolute right-3 top-1/2 -translate-y-1/2 text-gray-500/60" />
            </div>
        </div>
    );
}