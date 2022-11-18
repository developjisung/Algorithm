class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        System.out.println("1단계 : " + new_id);

        String temp = "";
        for(int i = 0; i < new_id.split("").length; i++){
            if(new_id.charAt(i) >=97 && new_id.charAt(i) <=122){      // 소문자
                temp = temp + new_id.charAt(i);
            }
            else if(new_id.charAt(i) == 45 || new_id.charAt(i) == 46 ||new_id.charAt(i)  == 95){
                temp = temp + new_id.charAt(i);
            }
            else if(new_id.charAt(i) >=48 && new_id.charAt(i) <= 57){
                temp = temp + new_id.charAt(i);
            }
        }
        System.out.println("2단계 : " + temp);

        String temp2 = "";
        for(int i = 0; i < temp.split("").length; i++) {
            if(((i + 1) == temp.split("").length)){

                if(i == 0){
                    temp2 = temp;
                }
                else{
                    if (temp.charAt(i) == 46) {

                        if ((i - 1) >= 0) {
                            if (temp.charAt(i - 1) == 46) {
                                continue;
                            }
                        }
                    }else{
                        temp2 = temp2 + temp.charAt(i);
                    }
                }
                break;
            }

            if (temp.charAt(i) == 46) {

                if((i-1) >= 0){
                    if(temp.charAt(i-1) == 46){
                        continue;
                    }
                }

                if (temp.charAt(i + 1) == 46) {
                    temp2 = temp2 + temp.charAt(i);
                    i = i + 1;
                }

                if((i-1) >= 0){
                    if(temp.charAt(i -1) != 46)
                        temp2 = temp2 + temp.charAt(i);
                }
            }
            else{
                temp2 = temp2 + temp.charAt(i);
            }
        }
        System.out.println("3단계 : " + temp2);

        String temp3 = "";
        for(int i = 0; i < temp2.split("").length; i++){
            if(temp2 == ""){
                break;
            }
            if(i == 0 && temp2.charAt(i) == 46){
                continue;
            }

            if(i == (temp2.split("").length - 1) && temp2.charAt(i) == 46){
                continue;
            }

            temp3 = temp3 + temp2.charAt(i);
        }
        System.out.println("4단계 : " + temp3);

        String temp4 = "";

        if(temp3 ==""){
            temp4 = temp4 + "a";
        }
        else{
            temp4 = temp3;
        }
        System.out.println("5단계 : " + temp4);

        String temp5 = "";

        if(temp4.split("").length >= 16){
            for(int i = 0; i< 15; i ++){
                if(temp4.charAt(i) == 46 && i == 14){
                    continue;
                }
                temp5 = temp5 + temp4.charAt(i);
            }
        }else{
            temp5 = temp4;
        }
        System.out.println("6단계 : " + temp5);

        String temp6 = temp5;
        if(temp5.split("").length <= 2){
            for(int i = 0; i<3; i++){
                temp6 = temp6 + temp5.charAt(temp5.split("").length - 1);

                if(temp6.split("").length == 3){
                    break;
                }
            }
        }

        System.out.println("7단계 : " + temp6);

        return temp6;
    }
}