"use client";

import { motion } from "framer-motion";
import { Option } from "@/components/option";
import { options } from "@/data/optionsContent";

export default function Home() {
  return (
    <motion.div
      className="mt-8 flex flex-col space-y-12 max-h-[700px] overflow-y-auto pb-4"
      initial={{ opacity: 0, x: -100 }}
      animate={{ opacity: 1, x: 0 }}
      transition={{ duration: 1, ease: "easeOut" }}
    >
      {options.map((option, index) => (
        <Option
          key={index}
          title={option.title}
          icon={option.icon}
        >
          {option.content}
        </Option>
      ))}
    </motion.div>
  );
}