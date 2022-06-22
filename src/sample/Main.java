package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    int score=0;
    Obstacle obs;
    Group G;
    Text l;
    Save save;

    public void setscorezero(){
        score=0;
    }
    public void setLabel(){
        l.setText("Score: "+score);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane canvas = new Pane();
        Ball b=new Ball();
        Group G9=new Group();
        G9.getChildren().add(canvas);
        Scene scene = new Scene(G9, 500, 700,Color.BLACK);
        save=new Save();

        Button button1 = new javafx.scene.control.Button("New Game");
        Button button2 = new javafx.scene.control.Button("Saved Games");
        Button button3 = new Button("Exit");
        button1.setPrefSize(200,30);
        button2.setPrefSize(200,30);
        button3.setPrefSize(200,30);
        button1.setLayoutX(150);
        button1.setLayoutY(150);
        button2.setLayoutX(150);
        button2.setLayoutY(250);
        button3.setLayoutX(150);
        button3.setLayoutY(350);
        Group root1=new Group();
        root1.getChildren().addAll(button1,button2,button3);
        Scene scene1=new Scene(root1,500,700,Color.BLACK);


        Button button4 = new Button("Resume");
        Button button5 = new Button("Save");
        Button button6 = new Button("Main Menu");
        button4.setPrefSize(200,30);
        button5.setPrefSize(200,30);
        button6.setPrefSize(200,30);
        button4.setLayoutX(150);
        button4.setLayoutY(150);
        button5.setLayoutX(150);
        button5.setLayoutY(250);
        button6.setLayoutX(150);
        button6.setLayoutY(350);
        Group root2=new Group();
        root2.getChildren().addAll(button4,button5,button6);
        Scene scene3=new Scene(root2,500,700,Color.BLACK);


        Button button7 = new Button("Save 1");
        Button button8 = new Button("Save 2");
        Button button9 = new Button("Save 3");
        Button button10 = new Button("Save 4");
        Button button11 = new Button("Save 5");
        button7.setPrefSize(200,30);
        button8.setPrefSize(200,30);
        button9.setPrefSize(200,30);
        button10.setPrefSize(200,30);
        button11.setPrefSize(200,30);
        button7.setLayoutX(150);
        button7.setLayoutY(100);
        button8.setLayoutX(150);
        button8.setLayoutY(200);
        button9.setLayoutX(150);
        button9.setLayoutY(300);
        button10.setLayoutX(150);
        button10.setLayoutY(400);
        button11.setLayoutX(150);
        button11.setLayoutY(500);
        Group root3=new Group();
        root3.getChildren().addAll(button7,button8,button9,button10,button11);
        primaryStage.setTitle("Saved Games");
        Scene scene2=new Scene(root3, 500, 700,Color.BLACK);


        Button button12 = new Button("Go To Checkpoint");
        Button button13 = new Button("Main Menu");
        button12.setPrefSize(200,30);
        button13.setPrefSize(200,30);
        button12.setLayoutX(150);
        button12.setLayoutY(150);
        button13.setLayoutX(150);
        button13.setLayoutY(350);
        Group root4=new Group();
        root4.getChildren().addAll(button12,button13);
        primaryStage.setTitle("Pause Menu");
        Scene scene4=new Scene(root4, 500, 700,Color.BLACK);


        Button button14 = new Button("Save 1");
        Button button15 = new Button("Save 2");
        Button button16 = new Button("Save 3");
        Button button17 = new Button("Save 4");
        Button button18 = new Button("Save 5");
        button14.setPrefSize(200,30);
        button15.setPrefSize(200,30);
        button16.setPrefSize(200,30);
        button17.setPrefSize(200,30);
        button18.setPrefSize(200,30);
        button14.setLayoutX(150);
        button14.setLayoutY(100);
        button15.setLayoutX(150);
        button15.setLayoutY(200);
        button16.setLayoutX(150);
        button16.setLayoutY(300);
        button17.setLayoutX(150);
        button17.setLayoutY(400);
        button18.setLayoutX(150);
        button18.setLayoutY(500);
        Group root5=new Group();
        root5.getChildren().addAll(button14,button15,button16,button17,button18);
        primaryStage.setTitle("Saved Games");
        Scene scene5=new Scene(root5, 500, 700,Color.BLACK);


        button2.setOnAction(e -> primaryStage.setScene(scene2));
        button3.setOnAction(e -> System.exit(0));

        button6.setOnAction(e -> primaryStage.setScene(scene1));

        button13.setOnAction(e -> primaryStage.setScene(scene1));



        Text text = new Text();
        text.setText("COLOR"+"\n" + "SWITCH");
        Group root9 = new Group();
        Group G10=new Group();
        Arc arc = new Arc();
        arc.setCenterX(250);
        arc.setCenterY(50);
        arc.setRadiusX(20);
        arc.setRadiusY(20);
        arc.setStartAngle(0);
        arc.setLength((Math.PI)*25+11);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.RED);
        //arc.setStroke(Color.BLACK);

        Arc arc1 = new Arc();
        arc1.setCenterX(250);
        arc1.setCenterY(50);
        arc1.setRadiusX(20);
        arc1.setRadiusY(20);
        arc1.setStartAngle(90);
        arc1.setLength((Math.PI)*25+11);
        arc1.setType(ArcType.ROUND);
        arc1.setFill(Color.HOTPINK);
//        arc1.setStroke(Color.HOTPINK);
        Arc arc2 = new Arc();
        arc2.setCenterX(250);
        arc2.setCenterY(50);
        arc2.setRadiusX(20);
        arc2.setRadiusY(20);
        arc2.setStartAngle(180);
        arc2.setLength((Math.PI)*25+11);
        arc2.setType(ArcType.ROUND);
        arc2.setFill(Color.YELLOW);
//        arc2.setStroke(Color.YELLOW);
        Arc arc3 = new Arc();
        arc3.setCenterX(250);
        arc3.setCenterY(50);
        arc3.setRadiusX(20);
        arc3.setRadiusY(20);
        arc3.setStartAngle(270);
        arc3.setLength((Math.PI)*25+11);
        arc3.setType(ArcType.ROUND);
//        arc3.setStroke(Color.BLUE);
        arc3.setFill(Color.BLUE);
        arc.setStrokeWidth(4);
        arc1.setStrokeWidth(4);
        arc2.setStrokeWidth(4);
        arc3.setStrokeWidth(4);
        G10.getChildren().addAll(arc,arc1,arc2,arc3);
        G10.setLayoutY(250);

        root9.getChildren().addAll(text,G10);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,20));
        text.setFill(Color.RED);
        text.setLayoutY(300);
        text.setLayoutX(210);
        Glow glow = new Glow();
        glow.setLevel(10);
        text.setEffect(glow);
        InnerShadow shadow = new InnerShadow();
        shadow.setBlurType(BlurType.GAUSSIAN);
        shadow.setColor(Color.WHITE);
        shadow.setHeight(25);
        shadow.setRadius(12);
        shadow.setWidth(20);
        shadow.setChoke(0.9);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(5000));
        fade.setFromValue(12);
        fade.setToValue(0.1);
        fade.setCycleCount(1000);
        fade.setAutoReverse(true);
        fade.setNode(text);
        fade.play();
        TranslateTransition translate1 = new TranslateTransition();
        translate1.setByY(100);
        translate1.setDuration(Duration.millis(1000));
        translate1.setCycleCount(500);
        translate1.setAutoReverse(true);
        translate1.setNode(G10);
        translate1.setFromY(-80);
        translate1.setToY(-180);
        translate1.play();
        TranslateTransition translate = new TranslateTransition();
        translate.setByY(100);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(500);
        translate.setAutoReverse(true);
        translate.setNode(text);
        translate.play();

        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(360);
        rotate.setCycleCount(15000);
        rotate.setDuration(Duration.seconds(1));
        rotate.setAutoReverse(false);
        rotate.setNode(G10);
        rotate.play();

        Scene scene6 = new Scene(root9,500,700.,Color.BLACK);


        l=new Text("Score: "+score);
        l.setLayoutX(canvas.getMinWidth()+50);
        l.setLayoutY(canvas.getMinHeight()+30);
        l.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,20));
        l.setFill(Color.WHITE);

        Circle ball=b.getBall();
        Star star=new Star();
        Group s=star.createStar();
        Group changec=star.createSwitch();
        randomObs();
        primaryStage.setTitle("Moving Ball");
        primaryStage.setScene(scene6);
        canvas.getChildren().addAll(ball,G,s,changec,l);
        primaryStage.show();
        //mainMenu(primaryStage);
        AnimationTimer a = new AnimationTimer() {
            @Override
            public void handle(long l) {
                G.setRotate(G.getRotate() + 1);
                changec.setRotate((changec.getRotate()-1));
                    int temp1 = star.checkcolor(b);
                    if (temp1 == 1) {
                        canvas.getChildren().remove(changec);
                    }
                int temp2 = star.checkscore(b);
                if (temp2 == 1) {
                    canvas.getChildren().remove(s);
                    score++;
                    setLabel();
                }
//                System.out.println(ball.getCenterY());
                if(ball.getCenterY()>(180.0)){
                    primaryStage.setScene(scene4);
                    stop();
                    ball.setCenterY(canvas.getMaxHeight());
                }
                if(ball.getCenterY()<(-500.0)){
                    ball.setCenterY(ball.getCenterY()+600);
                    star.addStar();
                    star.addswitch();
                    canvas.getChildren().remove(G);
                    randomObs();
                    canvas.getChildren().addAll(s,changec,G);
                }

                ball.setCenterY(ball.getCenterY()+1.2);

                int temp=obs.bump(ball);
                if(temp==1){
                    primaryStage.setScene(scene4);
                    stop();
                    ball.setCenterY(canvas.getMaxHeight());
                }
            }
        };
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode()==KeyCode.ESCAPE){
                    primaryStage.setScene(scene3);
                    a.stop();
                }
                if (keyEvent.getCode() == KeyCode.SPACE) {
                    ball.setCenterY(ball.getCenterY()-40);
                }
            }});
        button12.setOnAction(e -> {primaryStage.setScene(scene);
            a.start();
        });
        button4.setOnAction(e -> {primaryStage.setScene(scene);
            a.start();
        });
        button5.setOnAction(e -> {primaryStage.setScene(scene5);
        });
        scene6.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                primaryStage.setScene(scene1);
            }
        });
        button1.setOnAction(e -> {primaryStage.setScene(scene);
            a.start();
            setscorezero();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });
        button7.setOnAction(e -> {primaryStage.setScene(scene);
            score=save.loadGame(0);
            setLabel();
            a.start();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });
        button8.setOnAction(e -> {primaryStage.setScene(scene);
            score=save.loadGame(1);
            a.start();
            setLabel();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });
        button9.setOnAction(e -> {primaryStage.setScene(scene);
            score=save.loadGame(2);
            a.start();
            setLabel();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });
        button10.setOnAction(e -> {primaryStage.setScene(scene);
            score=save.loadGame(3);
            a.start();
            setLabel();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });
        button11.setOnAction(e -> {primaryStage.setScene(scene);
            score=save.loadGame(4);
            a.start();
            setLabel();
            canvas.getChildren().removeAll(s,changec);
            canvas.getChildren().addAll(s,changec);
            star.addStar();
            star.addswitch();
            ball.setCenterY(canvas.getMaxHeight());
            setLabel();
        });

        button14.setOnAction(e -> {primaryStage.setScene(scene);
            save.saveGame(score,0);
            a.start();
        });
        button15.setOnAction(e -> {primaryStage.setScene(scene);
            save.saveGame(score,1);
            a.start();
        });
        button16.setOnAction(e -> {primaryStage.setScene(scene);
            save.saveGame(score,2);
            a.start();
        });
        button17.setOnAction(e -> {primaryStage.setScene(scene);
            save.saveGame(score,3);
            a.start();
        });
        button18.setOnAction(e -> {primaryStage.setScene(scene);
            save.saveGame(score,4);
            a.start();
        });


    }
    public void randomObs(){
        int x=((int)(Math.random()*4))+1;
        switch (x){
            case 1:Obscircle obs4=new Obscircle();
                 obs=obs4;
                 break;
            case 2:Obssquare obs1=new Obssquare();
                obs=obs1;
                break;
            case 3:Obsdiamond obs2= new Obsdiamond();
                obs=obs2;
                break;
            case 4:ObsLine obs3=new ObsLine();
                obs=obs3;
                break;
        }
        G=obs.createObs();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
class Ball{
    private Color color;
    Circle ball;
    Ball(){
        color=Color.BLUE;
        ball = new Circle(10,color);
        ball.relocate(250, 500);
    }
    public void setColor(Color c){
        color=c;
    }

    public Color getColor() {
        return color;
    }
    public void randomColor(){
        int x=((int)(Math.random()*4))+1;
        switch (x){
            case 1:color=Color.HOTPINK;
                break;
            case 2:color=Color.RED;
                break;
            case 3:color=Color.BLUE;
                break;
            case 4:color=Color.YELLOW;
                break;
        }
        ball.setFill(color);
    }
    public Circle getBall(){
        return ball;
        //Circle b=new Circle
    }
}

abstract class Obstacle{
    Group G;
    Obstacle(){
        G=new Group();
    }
    public abstract Group createObs();
    public abstract int bump(Circle ball);
}

class Obscircle extends Obstacle{
    Arc arc;
    Arc arc1;
    Arc arc2;
    Arc arc3;
    Obscircle(){
        super();
        arc = new Arc();
        arc1 = new Arc();
        arc2 = new Arc();
        arc3 = new Arc();
    }
    @Override
    public int bump(Circle ball) {
        //System.out.println(arc1.getStroke());
        if(!(arc.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(arc,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if (!(arc1.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(arc1,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(arc2.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(arc2,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(arc3.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(arc3,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        return 0;

    }
    @Override
    public Group createObs(){
        arc.setCenterX(250);
        arc.setCenterY(200);
        arc.setRadiusX(70);
        arc.setRadiusY(70);
        arc.setStartAngle(0);
        arc.setLength((Math.PI)*25+11);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.RED);
        arc1.setCenterX(250);
        arc1.setCenterY(200);
        arc1.setRadiusX(70);
        arc1.setRadiusY(70);
        arc1.setStartAngle(90);
        arc1.setLength((Math.PI)*25+11);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.HOTPINK);
        arc2.setCenterX(250);
        arc2.setCenterY(200);
        arc2.setRadiusX(70);
        arc2.setRadiusY(70);
        arc2.setStartAngle(180);
        arc2.setLength((Math.PI)*25+11);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.YELLOW);
        arc3.setCenterX(250);
        arc3.setCenterY(200);
        arc3.setRadiusX(70);
        arc3.setRadiusY(70);
        arc3.setStartAngle(270);
        arc3.setLength((Math.PI)*25+11);
        arc3.setType(ArcType.OPEN);
        arc3.setStroke(Color.BLUE);
        //arc.setFill(Color.WHITE);
        //arc1.setFill(Color.WHITE);
        //arc2.setFill(Color.WHITE);
        //arc3.setFill(Color.WHITE);
        arc.setStrokeWidth(5);
        arc1.setStrokeWidth(5);
        arc2.setStrokeWidth(5);
        arc3.setStrokeWidth(5);
        G.getChildren().addAll(arc,arc1,arc2,arc3);
        return G;
    }
}
class Obssquare extends Obstacle{
    private Line L1;
    private Line L2;
    private Line L3;
    private Line L4;
    Obssquare(){
        super();
        L1=new Line(200,150,300,150);
        L2=new Line(300,150,300,250);
        L3=new Line(300,250,200,250);
        L4=new Line(200,250,200,150);
    }
    @Override
    public int bump(Circle ball) {
        if(!(L1.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L1,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if (!(L2.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L2,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L3.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L3,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L4.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L4,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        return 0;

    }
    @Override
    public Group createObs(){
        L1.setStrokeWidth(5);
        L2.setStrokeWidth(5);
        L3.setStrokeWidth(5);
        L4.setStrokeWidth(5);
        L1.setStroke(Color.HOTPINK);
        L2.setStroke(Color.BLUE);
        L3.setStroke(Color.RED);
        L4.setStroke(Color.YELLOW);
        G.getChildren().addAll(L1,L2,L3,L4);
        return G;

    }
}

class Obsdiamond extends Obstacle{
    private Line L9;
    private Line L10;
    private Line L11;
    private Line L12;
    Obsdiamond(){
        super();
         L9=new Line(250,100,315,200);
         L10=new Line(315,200,250,300);
         L11=new Line(250,300,185,200);
         L12=new Line(185,200,250,100);
    }
    @Override
    public int bump(Circle ball) {
        if(!(L9.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L9,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if (!(L10.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L10,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L11.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L11,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L12.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L12,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        return 0;

    }
    @Override
    public Group createObs(){
        L9.setStrokeWidth(5);
        L10.setStrokeWidth(5);
        L11.setStrokeWidth(5);
        L12.setStrokeWidth(5);L9.setStroke(Color.HOTPINK);
        L10.setStroke(Color.BLUE);
        L11.setStroke(Color.RED);
        L12.setStroke(Color.YELLOW);
        G.getChildren().addAll(L9,L10,L11,L12);
        return G;
    }
}
class ObsLine extends Obstacle {
    private Line L5;
    private Line L6;
    private Line L7;
    private Line L8;

    ObsLine() {
        super();
        L5 = new Line(200, 200, 200, 125);
        L6 = new Line(200, 200, 275, 200);
        L7 = new Line(200, 200, 200, 275);
        L8 = new Line(200, 200, 125, 200);
    }

    @Override
    public int bump(Circle ball) {
        if(!(L5.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L5,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if (!(L6.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L6,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L7.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L7,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        if(!(L8.getStroke().equals(ball.getFill()))){
            Shape s=Shape.intersect(L8,ball);
            if(s.getBoundsInLocal().getWidth() != -1)
                return 1;
        }
        return 0;

    }

    @Override
    public Group createObs() {
        L5.setStrokeWidth(5);
        L6.setStrokeWidth(5);
        L7.setStrokeWidth(5);
        L8.setStrokeWidth(5);
        L5.setStroke(Color.HOTPINK);
        L6.setStroke(Color.BLUE);
        L7.setStroke(Color.RED);
        L8.setStroke(Color.YELLOW);
        G.getChildren().addAll(L5, L6, L7, L8);
        return G;

    }
}

class Star{

    Group G;
    Group G1;
    int a,b;

    Star(){
        G1 = new Group();
        G=new Group();
        a=1;
        b=1;
    }
    public void addStar(){
        b=1;
    }
    public void addswitch(){
        a=1;
    }
    public int checkcolor(Ball ball){
        if(a==1)
            if(G1.getBoundsInParent().intersects(ball.getBall().getBoundsInParent())) {
            ball.randomColor();
            a=0;
            return 1;
        }
        return 0;
    }

    public int checkscore(Ball ball){
        if(b==1)
            if(G.getBoundsInParent().intersects(ball.getBall().getBoundsInParent())) {
                b=0;
                return 1;
            }
        return 0;
    }

    public Group createSwitch(){
        Arc arc = new Arc();
        arc.setCenterX(250);
        arc.setCenterY(50);
        arc.setRadiusX(10);
        arc.setRadiusY(10);
        arc.setStartAngle(0);
        arc.setLength((Math.PI)*25+11);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.RED);
        //arc.setStroke(Color.BLACK);

        Arc arc1 = new Arc();
        arc1.setCenterX(250);
        arc1.setCenterY(50);
        arc1.setRadiusX(10);
        arc1.setRadiusY(10);
        arc1.setStartAngle(90);
        arc1.setLength((Math.PI)*25+11);
        arc1.setType(ArcType.ROUND);
        arc1.setFill(Color.HOTPINK);
//        arc1.setStroke(Color.HOTPINK);
        Arc arc2 = new Arc();
        arc2.setCenterX(250);
        arc2.setCenterY(50);
        arc2.setRadiusX(10);
        arc2.setRadiusY(10);
        arc2.setStartAngle(180);
        arc2.setLength((Math.PI)*25+11);
        arc2.setType(ArcType.ROUND);
        arc2.setFill(Color.YELLOW);
//        arc2.setStroke(Color.YELLOW);
        Arc arc3 = new Arc();
        arc3.setCenterX(250);
        arc3.setCenterY(50);
        arc3.setRadiusX(10);
        arc3.setRadiusY(10);
        arc3.setStartAngle(270);
        arc3.setLength((Math.PI)*25+11);
        arc3.setType(ArcType.ROUND);
//        arc3.setStroke(Color.BLUE);
        arc3.setFill(Color.BLUE);
        arc.setStrokeWidth(4);
        arc1.setStrokeWidth(4);
        arc2.setStrokeWidth(4);
        arc3.setStrokeWidth(4);
        G1.getChildren().addAll(arc,arc1,arc2,arc3);
        return G1;
    }

    public Group createStar(){
        Line L1=new Line(242,352,246,344);
        Line L2=new Line(246,344,256,344);
        Line L3=new Line(256,344,246,336);
        Line L4=new Line(246,336,242,326);



        Line L5=new Line(242,326,238,333);
        Line L6=new Line(238,333,228,339);
        Line L7=new Line(228,339,235,342);
        Line L8=new Line(235,342,242,352);
        L1.setStrokeWidth(2);
        L2.setStrokeWidth(2);
        L3.setStrokeWidth(2);
        L4.setStrokeWidth(2);

        L5.setStrokeWidth(2);
        L6.setStrokeWidth(2);
        L7.setStrokeWidth(2);
        L8.setStrokeWidth(2);

        L1.setStroke(Color.WHITE);
        L2.setStroke(Color.WHITE);
        L3.setStroke(Color.WHITE);
        L4.setStroke(Color.WHITE);
        L5.setStroke(Color.WHITE);
        L6.setStroke(Color.WHITE);
        L7.setStroke(Color.WHITE);
        L8.setStroke(Color.WHITE);
        G.getChildren().addAll(L1,L2,L3,L4,L5,L6,L7,L8);
        G.setLayoutY(G.getLayoutY()-140);
        G.setLayoutX(G.getLayoutX()+10);
        return G;
    }
}

class Save{
    int[] save;
    Save(){
        save=new int[5];
        save[0]=0;
        save[1]=0;
        save[2]=0;
        save[3]=0;
        save[4]=0;
    }
    public void saveGame(int score,int pos){
        save[pos]=score;
    }
    public int loadGame(int pos){
        return save[pos];
    }
}