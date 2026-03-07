import { Option } from "@/components/option";
import { options } from "@/data/optionsContent";

export default function Home() {
  return (
    <div className="mt-12 flex flex-col space-y-12">

      {options.map((option, index) => (
        <Option
          key={index}
          title={option.title}
          icon={option.icon}
        >
          {option.content}
        </Option>
      ))}

    </div>
  );
}