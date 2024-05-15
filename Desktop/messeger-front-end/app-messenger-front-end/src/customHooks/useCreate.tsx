import { AxiosResponse } from "axios";
import { useState } from "react";
import api from "../axios/axios";
import { IUseCreate } from "../models/models";


export default function useCreate(){

    const [response,setResponse] = useState<AxiosResponse>();

    const [isLoading,setIsloading] = useState(false);

    // const [error,setError] = useState(null);

    const createData = async ({url, values}: IUseCreate) => {

        try{
            setIsloading(true);
            const response = await api.post(url,values);
            setResponse(response);
        }
        catch(errors){
            setIsloading(false);
            // setError(error);
            console.log(errors);
        }
        finally{
            setIsloading(false);
        }
    }

    return{response, isLoading, createData}
}