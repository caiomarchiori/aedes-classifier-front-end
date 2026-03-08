import { PiFirstAidBold, PiBrainBold } from "react-icons/pi";
import { GiChoice } from "react-icons/gi";

export const options = [
    {
        title: "Por que o controle de mosquitos Aedes aegypti importa?",
        icon: <PiFirstAidBold className="text-[#FAAD4F]" size={25} />,
        content: (
            <p>
                O controle do mosquito Aedes aegypti é fundamental para a saúde pública,
                pois essa espécie é o principal vetor de diversas arboviroses que afetam
                milhões de pessoas no mundo, como dengue, zika, chikungunya e febre amarela.
                Esses vírus são transmitidos quando o mosquito infectado pica seres humanos,
                permitindo a circulação das doenças em áreas urbanas e tropicais.
                <br /><br />
                Além disso, o Aedes aegypti apresenta características que favorecem sua disseminação:
                ele vive próximo às habitações humanas, reproduz-se em recipientes com água parada e pode picar várias
                pessoas durante um mesmo período de alimentação. Esse comportamento aumenta significativamente
                velocidade de transmissão dos vírus dentro das comunidades
                <br /><br />
                Para muitas dessas doenças, não existe tratamento específico amplamente
                disponível e, em alguns casos, as vacinas ainda são limitadas. Por esse
                motivo, estratégias de controle do mosquito, como eliminação de criadouros,
                monitoramento populacional e programas de vigilância, continuam sendo uma
                das principais formas de reduzir a incidência e prevenir surtos dessas doenças.
                <br /><br />
                Fonte:
                <div className="flex flex-col space-y-1 text-blue-400">
                    <a
                        href="https://www.mdpi.com/1420-3049/25/15/3484"
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                        Multidisciplinary Digital Publishing Institut (MDPI)
                    </a>
                    <a
                        href="https://www.who.int/activities/promoting-dengue-vector-surveillance-and-control"
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                        World Health Organization (WHO)
                    </a>
                </div>
            </p>
        )
    },
    {
        title: "O que são RNCs?",
        icon: <PiBrainBold className="text-[#FAAD4F]" size={25} />,
        content: (
            <p>
                As Redes Neurais Convolucionais estão fundamentadas nas pesquisas realizadas por Hubel e
                Wiesel em 1968. Esses pesquisadores apresentaram uma teoria sobre como os mamíferos interpretam
                visualmente o ambiente ao seu redor, utilizando uma estrutura em camadas de neurônios no cére-
                bro. As RNCs são arquiteturas que se destacam por sua capacidade de explorar a estrutura espacial
                dos dados, como a relação entre pixels em uma imagem. Elas utilizam filtros, também conhecidos
                como kernels, para realizar operações de convolução, gerando mapas de atributos (feature maps) que
                representam as informações extraídas.
                <br></br>
                As CNNs são frequentemente empregadas para classificação de imagens, segmentação, detec-
                ção de objetos, processamento de vídeos, processamento de linguagem natural e reconhecimento de
                fala
                <p className="text-blue-400">Otimização na classificação automática de mosquitos adultos: uma investigação com redes neurais convolucionais, Daniel da Silva Motta, 2019</p>
            </p>
        )
    },
    {
        title: "Como funciona a classificação de imagens?",
        icon: <GiChoice className="text-[#FAAD4F]" size={30} />,
        content: (
            <p>
                A classificação de imagens é feita a partir de um algoritmo que analisa uma imagem e a associa a uma determinada classe.
                Atualmente, uma das abordagens mais utilizadas para essa tarefa é o uso de Redes Neurais Convolucionais. Essas redes são compostas por
                múltiplas camadas que processam a imagem de entrada e identificam padrões visuais, como bordas, texturas e formas.
                À medida que a informação percorre diferentes camadas da rede, essas características tornam-se mais complexas, permitindo que o modelo
                reconheça estruturas e objetos presentes na imagem. Nas etapas finais da rede neural, as características extraídas são utilizadas para calcular
                a probabilidade de a imagem pertencer a cada uma das classes possíveis. A classe com maior probabilidade é então selecionada como resultado da classificação.
            </p>
        )
    }
];