

/*DATA TYPES*/
export interface IFormLogin {
	login: string;
	senha: string;
};

export interface IFormNewLogin {
	login: string;
	password: string;
	confirmPassword: string;
};

export interface IFormNewPassword {
	login: string;
	newPassword: string;
	confirmNewPassword: string;
}


/*COMPONENTS PROPS*/
export interface ICustomButton {
	label: string;
	type: "submit" | "button";
	onClick?: () => void
};

export interface IButtonCard extends ICustomButton {
};

export interface IInputCustomProps {
	placeholder: string;
	register: any;
	name: string;
	error?: boolean;
	helperText?: string;
};

/*HOOKS PROPS*/
export interface IUseCreate{
	url: string;
	values: any;
}