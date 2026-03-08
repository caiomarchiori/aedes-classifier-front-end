
import Link from "next/link";
import DengueSource from "../assets/dengue-virus.png"
import { InfoLayout } from "@/components/info-layout";

export default function Dengue() {
    const style = "text-blue-500 hover:underline"
    return (
        <InfoLayout
            image={DengueSource}
            imageAlt="Dengue"
            font="https://dengue.com.br/virus/"
            imageWidth={650}
        >
            <p className="text-lg">
                A <strong>dengue</strong> é uma infecção viral causada pelo <strong>vírus da dengue (DENV)</strong> e transmitida aos seres humanos principalmente pela picada de
                mosquitos infectados, especialmente o <Link className={style} href="/aedes">Aedes aegypti</Link>.
                <br></br>
                A doença ocorre com maior frequência em <strong>regiões tropicais e subtropicais</strong>,sobretudo em áreas <strong>urbanas e semiurbanas</strong>.
                <br></br>
                Atualmente, cerca de <strong>metade da população mundial</strong> está em risco de contrair dengue, com uma estimativa de <strong>100 a 400 milhões</strong>
                de infecções por ano. A incidência da doença aumentou significativamente nas últimas décadas, tornando-se um importante problema de saúde pública global.
                <br></br>
                A maioria das infecções não apresenta sintomas ou provoca apenas manifestações leves. Quando os <strong>sintomas</strong> aparecem, os mais comuns são febre alta,
                dor de cabeça, dores musculares e articulares. Em geral, os pacientes se recuperam em <strong>uma a duas semanas</strong>, porém alguns casos podem
                evoluir para <strong>dengue grave</strong>, que pode exigir hospitalização e, em situações raras, levar à morte.
                <br></br>
                Atualmente <strong>não existe</strong> um tratamento específico para a dengue.
                O manejo da doença baseia-se principalmente no <strong>controle da dor e no acompanhamento médico adequado</strong>, especialmente em casos mais graves.
                A <strong>detecção precoce</strong> e o acesso a cuidados de saúde apropriados contribuem para reduzir significativamente a mortalidade.
                <br></br>
                A forma mais eficaz de prevenir a doença é por meio do <strong>controle do mosquito transmissor</strong> e da redução das picadas, principalmente durante o dia. 
                Medidas como a eliminação de água parada e a adoção de ações de vigilância e controle do vetor são fundamentais para diminuir a transmissão da doença.
                <br></br>
                Nas últimas décadas, a dengue se expandiu rapidamente em todo o mundo. O número de casos registrados pela
                Organização Mundial da Saúde passou de <strong>505 mil em 2000 para mais de 14,6 milhões em 2024</strong>. Nesse mesmo ano, foram registradas mais de 
                <strong>12 mil mortes</strong> relacionadas à doença, com grande parte dos casos ocorrendo na Região das <strong>Américas</strong>.
                <br></br>
                <br></br>
                Adaptado de Organizacao Mundial da Saúde
                <a
                    href="https://www.who.int/news-room/fact-sheets/detail/dengue-and-severe-dengue"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="ml-2 text-blue-500 hover:underline"
                >
                    https://www.who.int/news-room/fact-sheets/detail/dengue-and-severe-dengue
                </a>
            </p>
        </InfoLayout>

    );
}