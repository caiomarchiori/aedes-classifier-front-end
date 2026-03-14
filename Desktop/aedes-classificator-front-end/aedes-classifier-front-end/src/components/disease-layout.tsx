import { ReactNode } from "react";
import { InfoLayout } from "@/components/info-layout";
import { Symptoms } from "@/components/symptoms";

type DiseaseLayoutProps = {
  image: any;
  imageAlt: string;
  font: string;
  imageWidth?: number;
  symptoms: string[];
  children: ReactNode;
};

export function DiseaseLayout({
  image,
  imageAlt,
  font,
  imageWidth = 650,
  symptoms,
  children
}: DiseaseLayoutProps) {
  return (
    <div className="flex flex-col space-y-20 items-center max-h-[700px] overflow-y-auto">
      
      <InfoLayout
        image={image}
        imageAlt={imageAlt}
        font={font}
        imageWidth={imageWidth}
      >
        {children}
      </InfoLayout>

      <Symptoms symptoms={symptoms} />

    </div>
  );
}
