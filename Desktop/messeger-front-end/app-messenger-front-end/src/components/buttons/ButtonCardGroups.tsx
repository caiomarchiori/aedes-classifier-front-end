import ButtonCard from "./ButtonCard";


export default function ButtonCardsGroups() {

  const buttonGroups = [
    {
			label: "button 1", onClick: () => {}
		},
    {
			label: "button 2", onClick: () => {}
		},
    {
			label: "button 3", onClick: () => {}
		},
    {
			label: "button 4", onClick: () => {}
		}
  ];

  return (
    <div className="grid grid-cols-2 gap-12 mt-20">
      {buttonGroups.map((button, index) => (
        <ButtonCard 
          key={index}
          label={button.label}
          onClick={button.onClick} 
          type="button"
        />
      ))}
    </div>
  );
}
