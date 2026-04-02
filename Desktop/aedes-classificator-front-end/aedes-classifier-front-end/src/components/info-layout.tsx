"use client";

import Image, { StaticImageData } from "next/image";
import { motion } from "framer-motion";

type InfoLayoutProps = {
  children: React.ReactNode;
  image: StaticImageData;
  imageAlt: string;
  font: string;
  imageWidth: number;
};

export function InfoLayout({
  children,
  image,
  imageAlt,
  font,
  imageWidth
}: InfoLayoutProps) {

  const fadeUp = { opacity: 0, y: 20 };
  const fadeUpAnimate = { opacity: 1, y: 0 };
  const fadeRight = { opacity: 0, x: 20 };
  const fadeRightAnimate = { opacity: 1, x: 0 };

  return (
    <div className="w-full mx-auto mt-5 flex justify-between p-6 space-x-12">

      <motion.div
        className="rounded-lg shadow-lg p-4 border border-black/5"
        initial={fadeUp}
        animate={fadeUpAnimate}
        transition={{ duration: 0.7 }}
      >
        <div className="text-lg">
          {children}
        </div>
      </motion.div>

      <motion.div
        className="flex flex-col space-y-2 w-full"
        initial={fadeRight}
        animate={fadeRightAnimate}
        transition={{ duration: 0.7, delay: 0.2 }}
      >
        <Image
          src={image}
          alt={imageAlt}
          width={imageWidth}
          className="rounded-2xl border-2 border-orange-400 object-cover"
        />

        <p className="text-sm text-gray-600 text-center font-extralight">
          Fonte: {font}
        </p>
      </motion.div>

    </div>
  );
}