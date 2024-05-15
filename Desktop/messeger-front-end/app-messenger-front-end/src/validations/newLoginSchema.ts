import * as yup from 'yup';

const newLoginSchema = yup.object({
  login: yup.string().required("Login é obrigatório"),
  password: yup.string().required("Senha é obrigatória"),
  confirmPassword: yup.string().required("Confirmacao de senha é obrigatória").oneOf([yup.ref('password')],"As senhas devem ser iguais")
});

export default newLoginSchema;