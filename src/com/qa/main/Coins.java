package com.qa.main;

public class Coins {
		static void change(double cost, double given) {
			if(given==cost) {
				System.out.println("No change.");
			} else {
				double received = 0;
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
				
				while(cost-a*received>0) {
					if(cost-(a+1)*50>0) {
						a++;
					} else {
						owed += a + "£50 note(s)\n";
						cost = cost - a*50;
					}
				}
				while(cost-b*received>0) {
					if(cost-(b+1)*20>0) {
						b++;
					} else {
						owed += b + "£20 note(s)\n";
						cost = cost - b*20;
					}
						
			}
				while(cost-c*received>0) {
					if(cost-(c+1)*10>0) {
						c++;
					} else {
						owed += c + "£10 note(s)\n";
						cost = cost - c*10;
					}
		}
				while(cost-d*received>0) {
					if(cost-(d+1)*5>0) {
						d++;
					} else {
						owed += d + "£5 note(s)\n";
						cost = cost - d*5;

}
				while(cost-e*received>0) {
						if(cost-(e+1)*2>0) {
							e++;
						} else {
							owed += e + "£2 coins(s)\n";
							cost = cost - e*2;
}
				while(cost-f*received>0) {
							if(cost-(f+1)*1>0) {
								f++;
							} else {
								owed += f + "£1 coins(s)\n";
								cost = cost - f*1;
}
				while(cost-e*received>0) {
								if(cost-(g+1)*0.5>0) {
									g++;
								} else {
									owed += g + "50p coins(s)\n";
									cost = cost - g*50;
}
				while(cost-h*received>0) {
									if(cost-(h+1)*0.2>0) {
										h++;
									} else {
										owed += h + "20p coins(s)\n";
										cost = cost - e*.2;
									}
				while(cost-i*received>0) {
										if(cost-(i+1)*0.1>0) {
											i++;
										} else {
											owed += i + "10p coins(s)\n";
											cost = cost - i*0.1;
										}
				while(cost-j*received>0) {
											if(cost-(j+1)*2>0) {
												j++;
											} else {
												owed += j + "5p coins(s)\n";
												cost = cost - j*0.05;
											}
											while(cost-k*received>0) {
												if(cost-(k+1)*0.02>0) {
													k++;
												} else {
													owed += k + "2p coins(s)\n";
													cost = cost - 2*0.02;
												}
												while(cost-l*received>0) {
													if(cost-(l+1)*0.01>0) {
														l++;
													} else {
														owed += l + "£2 coins(s)\n";
														cost = cost - l*0.01;
													}
												}
											}
				}
				}
				}
				}
				}
				}
				}
			System.out.println(owed);
			}
		}
}