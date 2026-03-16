import { DiseaseLayout } from "@/components/disease-layout";
import Link from "next/link";
import FebreSource from "../assets/febere-amarela-virus.jpg";

export default function FebreAmarela(){
     const symptoms = [
        "Febre",
        "Calafrios",
        "Dor de cabeça intensa",
        "Dor nas costas",
        "Dor no corpo em geral",
        "Dores musculares",
        "Náuseas e vômitos",
        "Fadiga",
        "Fraqueza"
    ];

    const style = "text-blue-500 hover:underline";

    return (
        <DiseaseLayout
            image={FebreSource}
            imageAlt="FebreAmarela"
            font="https://www.dw.com/pt-br/minist%C3%A9rio-da-sa%C3%BAde-confirma-25-mortes-por-febre-amarela/a-37218966"
            symptoms={symptoms}
        >
            <p className="text-lg">
                A <strong>Febre Amarela</strong> é uma doença infecciosa febril aguda causada por um vírus transmitido por mosquitos.
                A enfermidade possui evolução rápida e pode apresentar diferentes níveis de gravidade, <strong>podendo levar à morte</strong> em suas formas mais severas.
                Trata-se de uma doença <strong>imunoprevenível</strong>, ou seja, pode ser prevenida por meio da vacinação, que é a principal forma de proteção contra o vírus.
                <br></br>
                A transmissão da doença ocorre pela picada de mosquitos infectados e pode acontecer no <strong>Ciclo Urbano</strong>, onde a transmissão
                ocorre principalmente pelo mosquito <Link className={style} href="/aedes">Aedes aegypti</Link>, o mesmo <strong>vetor responsável</strong> pela transmissão
                de outras <strong>arboviroses</strong>.
                E também pode acontecer no <strong>Ciclo Silvestre</strong>, onde a <strong>transmissão</strong> ocorre por mosquitos de hábitos predominantemente silvestres,
                principalmente dos gêneros: <em>Haemagogus</em> e <em>Sabethes</em>. Nesse ciclo, <strong>macacos</strong> são os <strong>principais</strong> hospedeiros e
                amplificadores do vírus. O <strong>ser humano</strong> participa como hospedeiro acidental, quando entra em áreas onde o vírus está circulando.
                <br></br>
                No Brasil, atualmente, a febre amarela ocorre <strong>apenas</strong> no ciclo silvestre. Os <strong>últimos registros</strong> de transmissão urbana ocorreram em
                1942, e desde então todos os casos confirmados estão relacionados à <strong>transmissão silvestre</strong>.
                <br></br>
                A maioria das pessoas apresenta <strong>melhora</strong> após os sintomas iniciais. Entretanto, cerca de <strong>15%</strong> dos casos podem evoluir para
                formas <strong>mais graves</strong>, após um curto período sem sintomas. Ao apresentar <strong>sintomas</strong> e ter
                estado em <strong>áreas de risco</strong> nos últimos 15 dias, é importante procurar atendimento médico
                <br></br>
                Os macacos <strong>não transmitem febre amarela</strong>. Eles são considerados <strong>sentinelas da doença</strong>, pois indicam a circulação do vírus
                em determinada região. Caso sejam encontrados <strong>macacos mortos ou doentes</strong>, é fundamental comunicar às autoridades sanitárias
                ou ao serviço de zoonoses.
                <br></br>
                <strong>Não existe</strong> tratamento específico para a febre amarela. O tratamento é <strong>apenas</strong> sintomático, com assistência médica adequada
                e repouso. Nos <strong>casos graves</strong>, o paciente pode precisar de <strong>internação</strong> em Unidade de Terapia Intensiva (UTI)
                para <strong>reduzir</strong> complicações e risco de morte.
                <br></br>
                A <strong>principal</strong> forma de prevenção é a <strong>vacinação</strong>. O SUS oferece <strong>gratuitamente</strong> a vacina contra febre
                amarela para <strong>toda</strong> a população.
                <br></br>
                Desde 2017, o Brasil adota o esquema de <strong>dose única</strong> para toda a vida,
                seguindo recomendações da Organização Mundial da Saúde.
                <br></br>
                <br></br>
                Adaptado de Ministério da Saúde:
                <a
                    href="https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/f/febre-amarela"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="ml-2 text-blue-500 hover:underline"
                >
                    https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/f/febre-amarela
                </a>
            </p>
        </DiseaseLayout>
    );
}