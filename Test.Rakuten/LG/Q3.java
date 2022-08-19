package LG;

import java.util.*;

class Q3 {
    public int solution(int[] cards) {
        int answer = 0;

        int player = 0;
        int dealer = 0;
        int dealer_show = 0;

        if(cards.length < 4){
            return 0;
        }

        boolean flag = false;
        int index = 0;

        for(int i = 0; i < cards.length; i++){

            if(index == 0 || index == 2){
                if(cards[i] == 1){
                    player += oneOrEleven(player);
                }
                else
                    player += isOverTen(cards[i]);

                if(player >= 21 && dealer_show != 0)
                    flag = true;

                else if((dealer_show == 1 || dealer_show == 7) && player >= 17 && dealer_show != 0){
                    flag = true;
                }

                else if ((dealer_show == 2 || dealer_show == 3) && player >= 12 && dealer_show != 0){
                    flag = true;
                }
                index++;


            } else if (index == 1){
                if(cards[i] == 1){
                    dealer += oneOrEleven(dealer);
                }
                else
                    dealer += isOverTen(cards[i]);

                if(dealer >= 21)
                    flag = true;

                index++;

            } else if (index == 3){
                if(cards[i] == 1){
                    dealer_show = oneOrEleven(dealer);
                }
                else
                    dealer_show = isOverTen(cards[i]);

                dealer += dealer_show;

                if(dealer >= 21)
                    flag = true;

                else if((dealer_show == 1 || dealer_show == 7) && player >= 17){
                    flag = true;
                }

                else if(dealer_show == 4 || dealer_show == 5 || dealer_show == 6)
                    flag = true;

                else if ((dealer_show == 2 || dealer_show == 3) && player >= 12){
                    flag = true;
                }

                index = 0;
            }

            if(flag){
                // 블랙잭 승부
                System.out.println(player + " " + dealer);
                if(player == 21){
                    if(dealer != 21){
                        answer += 3;
                        System.out.println(3);
                    }
                    dealer = 0;
                    player = 0;
                    flag = false;
                    index = 0;
                }

                else{
                    if(dealer < 17){
                        for(int j = i + 1; j < cards.length; j++){
                            if(dealer < 17){
                                if(cards[i] == 1){
                                    dealer += oneOrEleven(dealer);
                                }
                                else
                                    dealer += isOverTen(cards[j]);
                                // System.out.println(j + " " + player + " " + dealer);
                            } else{
                                i = j;
                                break;
                            }

                            if(j == cards.length - 1){
                                i = j;
                                if(dealer < 17)
                                    flag = false;
                            }

                        }

                        // System.out.println(player + " " + dealer);

                        if(dealer < 17){
                            dealer = 0;
                            dealer_show = 0;
                            player = 0;
                            flag = false;
                            continue;
                        }

                        if(dealer > 21){
                            answer += 2;
                            // System.out.println(2);
                        } else if(dealer == 21) {
                            if(player != 21){
                                answer -= 2;
                                System.out.println(-2);
                            }
                        } else{
                            if(player == 21){
                                answer += 3;
                                System.out.println(3);
                            }
                            else if(player > 21){
                                answer -= 2;
                                System.out.println(-2);
                            } else{
                                if(dealer > player){
                                    answer -= 2;
                                    System.out.println(-2);
                                } else if(dealer < player){
                                    answer += 2;
                                    System.out.println(2);
                                }
                            }
                        }

                        dealer = 0;
                        dealer_show = 0;
                        player = 0;
                        flag = false;
                        continue;
                    }

                    else{
                        if(dealer > 21){
                            answer += 2;
                            System.out.println(2);
                        } else if(dealer == 21) {
                            if(player != 21){
                                answer -= 2;
                                System.out.println(-2);
                            }
                        } else{
                            if(player == 21)
                                answer += 3;
                            else if(player > 21){
                                answer -= 2;
                            } else{
                                if(dealer > player){
                                    answer -= 2;
                                } else if(dealer < player){
                                    answer += 2;
                                }
                            }
                        }

                        dealer = 0;
                        dealer_show = 0;
                        player = 0;
                        flag = false;
                        continue;
                    }
                }

            }
        }

        if(flag){
            if(player == 21){
                if(dealer != 21){
                    answer += 3;
                }
            }
            else {
                if(dealer > 21){
                    answer += 2;
                } else if(dealer == 21){
                    answer -= 2;
                }
            }
        }
        return answer;
    }

    static int isOverTen(int card){
        if(card >= 10)
            return 10;
        else
            return card;
    }

    static int oneOrEleven(int sum){
        if(sum >= 11){
            return 1;
        } else {
            return 11;
        }
    }
}