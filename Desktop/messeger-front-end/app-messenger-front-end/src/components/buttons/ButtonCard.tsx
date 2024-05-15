import { IButtonCard } from "../../models/models";


export default function ButtonCard({ label, onClick }: IButtonCard) {
  return (
    <button className="bg-white rounded-lg shadow-2xl px-36 py-24 hover:scale-105 duration-150" onClick={onClick} type="submit">
      {label}
    </button>
  )
}