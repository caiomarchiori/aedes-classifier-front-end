import { FaUsers } from "react-icons/fa";

type SymptomsType = {
    symptoms: string[]
}

export function Symptoms({symptoms}:SymptomsType) {
    return (
        <div className="w-full px-6">
            <div className="relative border-2 border-orange-400 rounded-xl px-24 py-14">
                <div className="absolute -top-9 left-1/2 -translate-x-1/2 bg-orange-400 px-[400px] xl:px-[500px] 2xl:px-[630px] rounded-full flex items-center gap-3 shadow-lg">
                    <div className="bg-white p-3 rounded-full shadow-black/60 shadow-md">
                        <FaUsers size={40} className="text-[#FF4500]" />
                    </div>
                    <p className="text-black font-semibold text-3xl">Sintomas</p>
                </div>
                <div className="grid grid-cols-3 gap-6 mt-6">
                    {symptoms.map((symptom, index) => (
                        <div
                            key={index}
                            className="border-2 border-blue-300 rounded-full py-2 text-center bg-gray-100 hover:scale-105 duration-200"
                        >
                            {symptom}
                        </div>
                    ))}
                </div>
            </div>
        </div>
    );
}
