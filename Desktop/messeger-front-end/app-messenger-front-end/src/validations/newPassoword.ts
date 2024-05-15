import * as yup from 'yup';

const newPasswordSchema = yup.object({
  login: yup.string().required("Login é obrigatório"),
  newPassword: yup.string().required("Senha é obrigatória"),
  confirmNewPassword: yup.string().required("Confirmacao de senha é obrigatória").oneOf([yup.ref('newPassword')],"As senhas devem ser iguais")
});

export default newPasswordSchema;