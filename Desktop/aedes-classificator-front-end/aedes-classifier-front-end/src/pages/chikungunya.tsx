import { DiseaseLayout } from "@/components/disease-layout";
import ChikungunyaSource from "../assets/chikungunya-virus.png";
import Link from "next/link";

export default function Chikungunya() {

    const symptoms = [
        "Febre",
        "Dores musculares",
        "Dor de cabeça",
        "Dores intensas nas articulações",
        "Manchas vermelhas pelo corpo",
        "Dor atrás dos olhos",
        "Dor nas costas",
        "Conjuntivite não-purulenta",
        "Náuseas e vômitos",
        "Dor de garganta",
        "Calafrios",
        "Diarreia "
    ];

    const style = "text-blue-500 hover:underline";

    return (
        <DiseaseLayout
            image={ChikungunyaSource}
            imageAlt="Chikungunya"
            font="https://www.biologianet.com/doencas/febre-chikungunya.htm"
            symptoms={symptoms}
        >
            <p className="text-lg">
                A <strong>Chikungunya</strong> é uma arbovirose transmitida pela picada de mosquitos infectados do gênero Aedes 
                especialmente o <Link className={style} href="/aedes">Aedes aegypti</Link>, principal vetor da doença no Brasil.
                O vírus responsável é o <strong>Chikungunya virus (CHIKV)</strong>,que chegou ao continente americano em 2013 e se espalhou rapidamente por diversos países.
                <br></br>
                No Brasil, os primeiros casos confirmados ocorreram em 2014 nos estados do Amapá e da Bahia. Desde então, a doença se disseminou pelo
                país e atualmente há registros de transmissão em todos os estados. Nos últimos anos, houve uma expansão significativa da doença para a região Sudeste.
                <br></br>
                Os sintomas mais característicos da chikungunya são <strong>febre</strong> , <strong>inchaço nas articulações</strong> e  <strong>dor articular intensa</strong>,
                que pode ser incapacitante. Em alguns casos também podem ocorrer outras manifestações clínicas e, mais raramente, complicações graves que exigem hospitalização.
                O vírus também pode provocar alterações neurológicas, como encefalite, meningite ou síndrome de Guillain-Barré.
                <br></br>
                O diagnóstico deve ser realizado por um médico, com base na avaliação clínica e em exames laboratoriais disponíveis no <strong>Sistema Único de Saúde (SUS)</strong>.
                <br></br>
                Atualmente <strong>não existe tratamento antiviral específico</strong> para a chikungunya. O tratamento é voltado para o alívio dos sintomas, com uso de analgésicos,
                hidratação adequada e acompanhamento médico. Em alguns casos, pode ser indicada fisioterapia para ajudar na recuperação das articulações.
                <br></br>
                A automedicação não é recomendada, pois pode mascarar sintomas e dificultar o diagnóstico correto da doença.
                <br></br>
                <br></br>
                Adaptado de Ministério da Saúde:
                <a
                    href="https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/c/chikungunya"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="ml-2 text-blue-500 hover:underline"
                >
                    https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/c/chikungunya
                </a>
            </p>
        </DiseaseLayout>
    );
}