"use client";

import { ReactNode, useState } from "react";
import { MdKeyboardArrowDown } from "react-icons/md";

interface OptionProps {
  title: string;
  icon: ReactNode;
  children: ReactNode;
}

export function Option({ title, icon, children }: OptionProps) {
  const [open, setOpen] = useState(false);

  return (
    <div
      className={`relative w-full max-w-6xl mx-auto transition-all
      ${open
          ? " rounded-2xl p-6 shadow-md"
          : "bg-[#E2E2E2]/30 rounded-full px-8 py-8 flex items-center"
        }`}
    >

      <button
        onClick={() => setOpen(!open)}
        className="absolute right-4 top-3 w-10 h-11"
      >
        <MdKeyboardArrowDown
          size={28}
          className={`transition-transform duration-300 text-black/20 hover:scale-110  ${open ? "rotate-180" : ""}`}
        />
      </button>

      {!open && (
        <div className="absolute left-1/2 -translate-x-1/2 flex items-center space-x-4">
          <span className="text-lg text-[#FAAD4F] font-medium">{title}</span>
          {icon}
        </div>
      )}

      {open && (
        <div className="flex flex-col space-y-3">
          <div className="text-[#FAAD4F] font-medium">
            <span>{title}</span>
          </div>

          <div className="w-full h-0.5 bg-[#E2E2E2] bg-opacity-60" />

          <div className="text-gray-800">
            {children}
          </div>

        </div>
      )}
    </div>
  );
}