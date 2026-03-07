import { PiFirstAidBold, PiBrainBold } from "react-icons/pi";
import { GiChoice } from "react-icons/gi";

export const options = [
  {
    title: "Por que o controle de mosquitos Aedes aegypti importa?",
    icon: <PiFirstAidBold className="text-[#FAAD4F]" size={25} />,
    content: (
      <p>
        O Aedes aegypti é o principal vetor de doenças como dengue,
        chikungunya, zika e febre amarela urbana.
      </p>
    )
  },
  {
    title: "O que são RNCs?",
    icon: <PiBrainBold className="text-[#FAAD4F]" size={25} />,
    content: (
      <p>
        Redes Neurais Convolucionais são modelos de deep learning
        usados para classificação de imagens.
      </p>
    )
  },
  {
    title: "Como funciona a classificação de imagens?",
    icon: <GiChoice className="text-[#FAAD4F]" size={30} />,
    content: (
      <p>
        O modelo recebe imagens de mosquitos e aprende padrões visuais
        para identificar o Aedes aegypti automaticamente.
      </p>
    )
  }
];