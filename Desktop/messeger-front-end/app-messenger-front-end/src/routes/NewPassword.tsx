
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import newPasswordSchema from "../validations/newPassoword";
import { IFormNewPassword } from "../models/models";
import InputCustom from "../components/inputs/InputCustom";
import CustomButton from "../components/buttons/CustomButton";


export default function NewPassword() {

  const onSubmit = (values: IFormNewPassword) => {
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
    resolver: yupResolver(newPasswordSchema),
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
          placeholder="Nova senha"
          register={register}
          name="newPassword"   
          error
          helperText={errors.newPassword?.message}
        />
        <InputCustom
          placeholder="Confirme a senha"
          register={register}
          name="confirmNewPassword"   
          error
          helperText={errors.confirmNewPassword?.message}
        />
        <CustomButton label="Restaurar senha" type="submit"/>
      </form>
    </>
  )
}