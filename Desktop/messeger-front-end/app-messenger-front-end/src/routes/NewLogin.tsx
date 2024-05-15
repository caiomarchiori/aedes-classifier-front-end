
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import newLoginSchema from "../validations/newLoginSchema";
import { IFormNewLogin } from "../models/models";
import InputCustom from "../components/inputs/InputCustom";
import CustomButton from "../components/buttons/CustomButton";


export default function NewLogin() {

  const onSubmit = (values: IFormNewLogin) => {
    /*TODO LOGIN LOGIC*/
    console.log(values);
    reset();
  }

  const {
    register,
    handleSubmit,
    reset,
    formState: { errors },
  } = useForm({
    resolver: yupResolver(newLoginSchema),
  })

  return (
    <>
      <form className="flex flex-col justify-center items-center space-y-20" onSubmit={handleSubmit(onSubmit)}>
    	  <InputCustom
          placeholder="Login"
          register={register} 
          name="login" 
          error
          helperText={errors.login?.message}
        />
        <InputCustom
          placeholder="Senha"
          register={register}
          name="password"   
          error
          helperText={errors.password?.message}
        />
        <InputCustom
          placeholder="Confirme a senha"
          register={register}
          name="confirmPassword"   
          error
          helperText={errors.confirmPassword?.message}
        />
        <CustomButton label="Cadastrar" type="submit"/>
      </form>
    </>
  )
}