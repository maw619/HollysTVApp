//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wolff.controller;

import com.wolff.dao.DaoImpl;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TVController implements Initializable {
    @FXML
    private Button btnCNN;
    @FXML
    private Button btnChile;
    @FXML
    private Button btnESPN;
    @FXML
    private Button btnESPN2;
    @FXML
    private Button btnFood;
    @FXML
    private Button btnFOX;
    @FXML
    private Button btnSky;
    @FXML
    private Button btnFoxBusiness;
    @FXML
    private Button btnFS1;
    @FXML
    private Button btnFS2;
    @FXML
    private Button btnFreeform;
    @FXML
    private Button btnHLN;
    @FXML
    private Button btnHallmarkMovie;
    @FXML
    private Button btnID;
    @FXML
    private Button btnNickelodeon;
    @FXML
    private Button btnCronica;
    @FXML
    private Button btnSHOWTIME;
    @FXML
    private Button btnStarz;
    @FXML
    private Button btnSundance;
    @FXML
    private Button btnLifetime;
    @FXML
    private Button btn24horas;
    @FXML
    private Button btnTravel;
    @FXML
    private Button btnLifetimeMovie;
    @FXML
    private Button btnNatGeo;
    @FXML
    private Button btnTennis;
    @FXML
    private Button btnWEATHER;
    @FXML
    private Button btnTLC;
    @FXML
    private Button btnTCM;
    @FXML
    private Button btnUSA;
    @FXML
    private Button btnTeleSur;
    @FXML
    private Button btnDW;
    @FXML
    private Button btnDisneyChannel;
    @FXML
    private Button btnHistory;
    @FXML
    private Button btnComedy;
    @FXML
    private Button btnMSNBC;
    @FXML
    private Button btnTBS;
    @FXML
    private Button btnNBC;
    @FXML
    private Button btnDisneyXD;
    @FXML
    private Button btnTelemundo;
    @FXML
    private Button btnUnivision;
    @FXML
    private Button btnFoxNews;
    @FXML
    private Button btnDiscovery;
    @FXML
    private Button btnEuroNews;
    @FXML
    private Button btnT13Movil;
    @FXML
    private Button btnA24;
    @FXML
    private Button btnAmericaTV;
    @FXML
    private Button btnTN;
    @FXML
    private Button btnTVLand;
    @FXML
    private Button btnYoutube;
    @FXML
    private Button btnTNT;
    @FXML
    private Button btnMLB;
    @FXML
    private Button btnABCNews;
    @FXML
    private Button btnFX;
    @FXML
    private Button btnFXX;
    @FXML
    private Button btnFXM;
    @FXML
    private Button btnHallmark;
    @FXML
    private Button btnHBO;
    @FXML
    private Button btnCanal13;
    @FXML
    private Button btnABC;
    @FXML
    private Button btnAMC;
    @FXML
    private Button btnCBS;
    @FXML
    private Button btnCNBC;
    @FXML
    private Button btnNTN24;
    @FXML
    private Button btnAlJazeera;
    @FXML
    private Button btnApagar;
    @FXML
    private Button btnX;
    @FXML
    private Button btnCbnNews;
    @FXML
    private Button btnSonLife;
    @FXML
    private Button btnVictoryChannel;
    @FXML
    private Button btnGlobalPrayer;
    @FXML
    private DaoImpl d;

    public void initialize(URL url, ResourceBundle rb) {
    }
    
    @FXML
    public void GlobalPrayer() {
        this.btnGlobalPrayer.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=KFJXYLu5LMg"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }
    
    @FXML
    public void VictoryChannel() {
        this.btnVictoryChannel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=YoU8ASF7Q6Q"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }
    
    @FXML
    public void CbnNews() {
        this.btnCbnNews.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=AJ1V00eut3s"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }
    
    @FXML
    public void SonLife() {
        this.btnSonLife.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=5Tw5xhRsonc"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTeleSur() {
        this.btnTeleSur.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=jqV_53q3LUI/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelMLB() {
        this.btnMLB.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/mlb-network/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTNT() {
        this.btnTNT.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Qh5Yjmaptbc"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelAlJazeera() {
        this.btnAlJazeera.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=WisZM9CMlTo"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelYoutube() {
        this.btnYoutube.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTVLand() {
        this.btnTVLand.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/tv-land-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTN() {
        this.btnTN.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/tnt/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelA24() {
        this.btnA24.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=9YbTRdhRV6A"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelT13Movil() {
        this.btnT13Movil.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=bOvhCYr1NYk"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelEuroNews() {
        this.btnEuroNews.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=6DB_p2sMJTE"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelDiscovery() {
        this.btnDiscovery.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/investigation-discovery-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFoxNews() {
        this.btnFoxNews.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fox-news-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelUnivision() {
        this.btnUnivision.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/univision/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTelemundo() {
        this.btnTelemundo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/telemundo/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelDisneyXD() {
        this.btnDisneyXD.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/disneyxd/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelNTN24() {
        this.btnNTN24.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=ZLWzGxwBAB0"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelNBC() {
        this.btnNBC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/nbc/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTBS() {
        this.btnTBS.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/tbs-channel-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelComedy() {
        this.btnComedy.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/comedy-central-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelHistory() {
        this.btnHistory.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/history-channel-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelDisney() {
        this.btnDisneyChannel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/disney-channel-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelDW() {
        this.btnDW.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=6B8n7o699uM/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelUSA() {
        this.btnUSA.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/usa-network-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTCM() {
        this.btnTCM.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/tcm/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelWeather() {
        this.btnWEATHER.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/the-weather-channel-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTLC() {
        this.btnTLC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(" https://ustvgo.tv/tlc-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTennis() {
        this.btnTennis.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/tennis-channel-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelNatGeo() {
        this.btnNatGeo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/national-geographic-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelLifetimeMovie() {
        this.btnLifetimeMovie.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/lifetime-movies/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTravel() {
        this.btnTravel.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(" https://ustvgo.tv/travel-channel-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void Channel24horas() {
        this.btn24horas.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=ab-t4yzr0KI"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelLifetime() {
        this.btnLifetime.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/lifetime-channel-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelSundance() {
        this.btnSundance.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/sundance-tv/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelStarz() {
        this.btnStarz.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/starz-channel-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelShowtime() {
        this.btnSHOWTIME.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/showtime/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelNick() {
        this.btnNickelodeon.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/nickelodeon-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void Channel_ID() {
        this.btnID.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/investigation-discovery-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelHallmarkMovie() {
        this.btnHallmarkMovie.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/hallmark-movies-mysteries-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFoxBusiness() {
        this.btnFoxBusiness.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fox-business-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelHLN() {
        this.btnHLN.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/hln/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFreeform() {
        this.btnFreeform.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/freeform-channel-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFS1() {
        this.btnFS1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fox-sports-1/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFS2() {
        this.btnFS2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fox-sports-2/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelSkyNews() {
        this.btnSky.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=9Auq9mYxFEE"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFox() {
        this.btnFOX.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fox-hd-live-streaming/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFoodNetwork() {
        this.btnFood.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/food-network-live-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelESPN2() {
        this.btnESPN2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/espn2/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelESPN() {
        this.btnESPN.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/espn-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelTVChile() {
        this.btnChile.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.freeintertv.com/view/id-2940"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelCanal_13() {
        this.btnCanal13.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=3Q5IPa88woI"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelCBS() {
        this.btnCBS.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/cbs-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelCNBC() {
        this.btnCNBC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/cnbc-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelHBO() {
        this.btnHBO.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/hbo/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelHallmark() {
        this.btnHallmark.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/hallmark-channel-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFXM() {
        this.btnFXM.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fxm/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFX() {
        this.btnFX.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fx-channel-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelFXX() {
        this.btnFXX.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/fxx/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelCronica() {
        this.btnCronica.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Az0j4H6tfg4"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelMSNBC() {
        this.btnMSNBC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/msnbc-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelCNN() {
        this.btnCNN.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.freeintertv.com/view/id-2940"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelABC() {
        this.btnABC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/abc-live-streaming-free/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelABCNews() {
        this.btnABCNews.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=w_Ma8oQLmSM/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelAMC() {
        this.btnAMC.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://ustvgo.tv/amc-live/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void ChannelAmericaTV() {
        this.btnAmericaTV.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=li3GN0Hm7w8&vq=hd1080/"));
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    @FXML
    public void apagar() {
    }

    @FXML
    public void exit() {
        Platform.exit();
    }
}
