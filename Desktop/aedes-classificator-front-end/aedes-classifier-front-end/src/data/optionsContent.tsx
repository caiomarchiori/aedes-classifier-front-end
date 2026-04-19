import { PiFirstAidBold, PiBrainBold } from "react-icons/pi";
import { GiChoice } from "react-icons/gi";
import { MdOutlineLiveHelp } from "react-icons/md";
import { MdDataset } from "react-icons/md";


export const options = [
    {
        title: "Por que o controle de mosquitos Aedes aegypti importa?",
        icon: <PiFirstAidBold className="text-[#FAAD4F]" size={25} />,
        content: (
            <p>
                O controle do mosquito <em>Aedes aegypti</em> é fundamental para a saúde pública,
                pois essa espécie é o principal vetor de diversas arboviroses que afetam
                milhões de pessoas no mundo, como dengue, zika, chikungunya e febre amarela.
                Esses vírus são transmitidos quando o mosquito infectado pica seres humanos,
                permitindo a circulação das doenças em áreas urbanas e tropicais.
                <br /><br />
                Além disso, o <em>Aedes aegypti</em> apresenta características que favorecem sua disseminação:
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
        title: "Como funciona a classificação de imagens ?",
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
    },
    {
        title: "Como a IA pode ajudar no combate às arboviroses ?",
        icon: <MdOutlineLiveHelp className="text-[#FAAD4F]" size={30} />,
        content: (
            <p>
                Utilizando técnicas de Visão Computacional
                e Aprendizado de Máquina, algoritmos podem analisar características visuais dos insetos, como formato do corpo, padrões nas asas e outras estruturas
                morfológicas, permitindo identificar espécies de forma rápida e automatizada.
                Esse tipo de tecnologia pode auxiliar pesquisadores e profissionais de saúde pública na vigilância entomológica, que é o monitoramento das populações de
                mosquitos em determinadas regiões.
                <br></br>
                Com sistemas automatizados de classificação, é possível analisar grandes quantidades de imagens com mais rapidez,
                reduzindo o tempo necessário para a identificação manual feita por especialistas.
                Além disso, ferramentas baseadas em IA podem contribuir para identificar áreas com maior risco de infestação, apoiar programas de controle do
                vetor e melhorar estratégias de prevenção. Dessa forma, a tecnologia se torna uma aliada importante no combate às arboviroses, ajudando a tornar
                o monitoramento mais eficiente e possibilitando respostas mais rápidas diante de surtos.
            </p>
        )
    },
    {
        title: "Conjunto de dados utilizados",
        icon: <MdDataset className="text-[#FAAD4F]" size={25} />,
        content: (
            <p>
                Os conjuntos de dados são fundamentais para treinar, validar e testar modelos de aprendizado de máquina, garantindo que eles aprendam a reconhecer
                padrões corretamente.
                <br></br>
                Neste trabalho, foram utilizados dois conjuntos de dados distintos, cada um contendo imagens de mosquitos em diferentes condições e espécies.
                O dataset  <a className="text-blue-500 underline" href="https://www.kaggle.com/datasets/pradeepisawasan/aedes-mosquitos"target="_blank"rel="noopener noreferrer">Aedes Mosquitos Dataset</a> contém
                imagens rotuladas de mosquitos Aedes aegypti e Aedes albopictus, capturadas em diferentes ângulos e iluminações.
                O dataset <a className="text-blue-500 underline" href="https://data.mendeley.com/datasets/88s6fvgg2p/4"target="_blank"rel="noopener noreferrer">Dataset of Vector Mosquito Images Mendeley</a> apresenta
                uma variedade maior de espécies de mosquitos, incluindo Aedes aegypti, Anopheles stephensi e Culex quinquefasciatus.
                Ele fornece diversidade em termos de posição, tamanho e iluminação das imagens, permitindo que o modelo generalize melhor para diferentes
                cenários de captura.
                <br></br>
                Ambos os datasets foram pré-processados, normalizando o tamanho e o formato das imagens, para garantir consistência na entrada dos modelos.
                Além disso, técnicas de aumento de dados (como rotações e ajustes de brilho) também foram aplicadas.
            </p>
        )
    }

];