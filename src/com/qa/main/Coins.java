package com.qa.main;

public class Coins {
		static void change(double cost, double given) {
			if(given==cost) {
				System.out.println("No change.");
			} else {
				double difference = given - cost;
				String owed = "You receive:\n";
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				int e = 0;
				int f = 0;
				int g = 0;
				int h = 0;
				int i = 0;
				int j = 0;
				int k = 0;
				int l = 0;
				
				while(difference-a*50>=0) {
					if(difference-(a+1)*50>=0) {
						a++;
					} else {
						owed += a + " £50 note(s)\n";
						difference = difference - a*50;
						break;
					}
				}
				while(difference-b*20>=0) {
					if(difference-(b+1)*20>0) {
						b++;
						System.out.println("*b");
					} else {
						owed += b + " £20 note(s)\n";
						difference = difference - b*20;
						System.out.println("b");
						break;
					}
						
				}
				while(difference-c*10>=0) {
					if(difference-(c+1)*10>0) {
						c++;
						System.out.println("*c");
					} else {
						owed += c +  "£10 note(s)\n";
						difference = difference - c*10;
						System.out.println("c");
						break;
					}
				}
				while(difference-d*5>=0) {
					if(difference-(d+1)*5>0) {
						d++;
					} else {
						owed += d + " £5 note(s)\n";
						difference = difference - d*5;
						break;
					}
				}
				while(difference-e*2>=0) {
					if(difference-(e+1)*2>0) {
						e++;
					} else {
						owed += e + " £2 coins(s)\n";
						difference = difference - e*2;
						break;
					}
				}
				while(difference-f*1>=0) {
					if(difference-(f+1)*1>0) {
						f++;
					} else {
						owed += f +  " £1 coins(s)\n";
						difference = difference - f*1;
						break;
					}
				}
				while(difference-g*0.05>=0) {
						if(difference-(g+1)*0.5>0) {
							g++;
						} else {
							owed += g + " 50p coins(s)\n";
							difference = difference - g*0.5;
							break;
						}
				}
				while(difference-h*0.2>=0) {
						if(difference-(h+1)*0.2>0) {
							h++;
						} else {
							owed += h + " 20p coins(s)\n";
							difference = difference - e*.2;
							break;
						}
				}
				while(difference-i*0.1>=0) {
						if(difference-(i+1)*0.1>0) {
							i++;
						} else {
							owed += i + " 10p coins(s)\n";
							difference = difference - i*0.1;
							break;
						}
				}
				while(difference-j*0.05>=0) {
						if(difference-(j+1)*2>0) {
							j++;
						} else {
							owed += j + " 5p coins(s)\n";
							difference = difference - j*0.05;
							break;
						}
				}
				while(difference-k*0.02>=0) {
						if(difference-(k+1)*0.02>0) {
							k++;
						} else {
							owed += k + " 2p coins(s)\n";
							difference = difference - 2*0.02;
							break;
						}
				}
				while(difference-l*0.01>=0) {
						if(difference-(l+1)*0.01>0) {
							l++;
						} else {
							owed += l + " 1p coins(s)\n";
							difference = difference - l*0.01;
							break;
						}
				}
				System.out.println(owed);
				}
				}
}
			
