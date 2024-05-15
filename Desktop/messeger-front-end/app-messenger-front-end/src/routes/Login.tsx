
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import loginSchema from "../validations/loginSchema";
import api from "../axios/axios";
import { IFormLogin } from "../models/models";
import InputCustom from "../components/inputs/InputCustom";
import CustomButton from "../components/buttons/CustomButton";

export default function Login() {

  const onSubmit = async (values: IFormLogin) => {
    
    /*TODO LOGIN LOGIC*/
    console.log(values);
    try{
      const response = await api.get("/teste");
      console.log(response);
    }
    catch(errors){
      console.log(errors);
    }
  }

  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm({
    resolver: yupResolver(loginSchema),
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
          name="senha"   
          error
          helperText={errors.senha?.message}     />
        <CustomButton label="Entrar" type="submit"/>
      </form>
    </>
  )
}