import Image, { StaticImageData } from "next/image";

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
  return (
    <div className="w-full mx-auto mt-5 flex justify-between p-6 space-x-12">
      
      <div className="rounded-lg shadow-lg p-4 border border-black/5">
        <div className="text-lg">
          {children}
        </div>
      </div>

      <div className="flex flex-col space-y-2 w-full">
        <Image
          src={image}
          alt={imageAlt}
          width={imageWidth}
          className="rounded-2xl border-2 border-orange-400 object-cover"
        />

        <p className="text-sm text-gray-600 text-center font-extralight">
          Fonte: {font}
        </p>
      </div>

    </div>
  );
}