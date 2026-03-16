import { DiseaseLayout } from "@/components/disease-layout";
import Link from "next/link";
import ZikaVirus from "../assets/zika-virus.jpeg";

export default function Zika() {
    const symptoms = [
        "Febre baixa (≤38,5 ºC) ou ausente",
        "Exantema de início precoce",
        "Conjuntivite não purulenta;",
        "Dor de cabeça",
        "Artralgia",
        "Astenia ",
        "Mialgia",
        "Edema periarticular",
        "Linfonodomegalia"
    ];

    const style = "text-blue-500 hover:underline";

    return (
        <DiseaseLayout
            image={ZikaVirus}
            imageAlt="Zika"
            font="http://crbio08.gov.br/noticias/saude/cientistas-desvendam-estrutura-do-virus-zika/"
            symptoms={symptoms}
        >
            <p className="text-lg">
                A <strong>Zika</strong> é uma  <strong>arbovirose</strong> causada pelo vírus Vírus Zika (ZIKV).
                Arboviroses são doenças <strong>virais</strong> transmitidas principalmente pela picada de mosquitos infectados.
                <br></br>
                O vírus foi identificado pela primeira vez em <strong>1947</strong>, em macacos na floresta Zika, em Kampala, Uganda.
                O primeiro caso <strong>humano</strong> foi registrado em 1953, na Nigéria. Desde então, o vírus se <strong>espalhou</strong> por diversos países da África,
                Ásia, Oceania e Américas.
                <br></br>
                A principal forma de <strong>transmissão</strong> ocorre pela picada do mosquito <Link className={style} href="/aedes">Aedes aegypti</Link>, especialmente
                pelas <strong>fêmeas</strong> infectadas. Esse mosquito costuma <strong>picar</strong> principalmente durante o dia,
                o que torna <strong>importante</strong> a adoção de medidas de proteção ao longo de todo o período diurno.
                <br></br>
                A infecção pelo Zika pode ser <strong>assintomática ou sintomática</strong>. Quando <strong>sintomas</strong> aparecem, geralmente são <strong>leves e autolimitados</strong>,
                semelhantes aos observados em outras arboviroses como <Link className={style} href="/dengue">Dengue</Link> e <Link className={style} href="/chikungunya">Chikungunya</Link>.
                O <strong>período de incubação</strong> da doença costuma variar entre <strong>2 e 7 dias</strong>.
                <br></br>
                Embora a <strong>maioria</strong> dos casos seja leve, o Zika <strong>pode estar</strong> associado a complicações graves.
                Entre as  <strong>principais</strong> estão:
                <ul>
                    <li>
                        <span className="underline">Síndrome de Guillain-Barré:</span> condição neurológica rara em que o sistema imunológico ataca os nervos periféricos.
                    </li>
                    <li>
                        <span className="underline">Microcefalia:</span> malformação congênita caracterizada pelo desenvolvimento incompleto do cérebro do bebê.
                    </li>
                </ul>
                <strong>Gestantes infectadas</strong> podem transmitir o vírus ao feto, podendo causar: Aborto espontâneo, Óbito fetal, Malformações congênitas
                Também podem ocorrer outras <strong>complicações neurológicas</strong>, como encefalite, mielite e neurite óptica.
                <br></br>
                O <strong>diagnóstico inicial</strong> é realizado por avaliação clínica médica e confirmado por exames laboratoriais disponíveis no <strong>Sistema Único de Saúde</strong>.
                <br></br>
                Atualmente <strong>não existe</strong> tratamento antiviral específico para a infecção pelo Zika.
                O tratamento é <strong>sintomático</strong>, focado no <strong>alívio</strong> dos sintomas e acompanhamento médico, principalmente em casos com complicações.
                Além disso, também <strong>não existe</strong> vacina disponível para o Zika. Por isso, a <strong>principal</strong> forma de <strong>prevenção</strong> é
                o controle do mosquito transmissor.
                <br></br>
                <br></br>
                Adaptado de Ministério da Saúde:
                <a
                    href="https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/z/zika-virus"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="ml-2 text-blue-500 hover:underline"
                >
                    https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/z/zika-virus
                </a>
            </p>
        </DiseaseLayout>
    );
}