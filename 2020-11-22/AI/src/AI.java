import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}


class MainCanvas extends Canvas
{

	/*
	变量的声明
	语法：数据类型 变量名称（标识符）;
	*/
	
	int x,y;
	Image heroImage[][] = new Image[4][3];
	Image currentImg;

	boolean o = true;
	boolean j = true;
	boolean k = true;
	boolean f = true;
	

	/*
	Image[] img = new Image[];
	boolean i = true;
	for(int i=1;i<10;i++){
		img[0]=Image.createImage("/sayo" + i + ".png");
	}*/


	//Image img,img1,img2,img3,img4,img5,img6,currentImg;


	public MainCanvas(){
		try
		{




			for(int i=0;i<heroImage.length;i++){
				for(int p=0;p<heroImage[i].length;p++){
					heroImage[i][p]=Image.createImage("/sayo"+i+p+".png");
				}
			}
			/*
			给变量赋值
			语法：变量名称=value;
			*/
			/*
			for(int i=0;i<heroImg.length;i++){
				for(int j=0;j<heroImg[i].length;j++){
					heroImg=Image.creatImage("/sayo" + i + j + ".png");
				}
			}
*/


			currentImg=heroImage[0][1];
			x = 120;
			y = 100;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,x,y,0);//120：X坐标、100：Y坐标
	}


	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action的值：UP、DOWN、LEFT、RIGHT
		*/
		if(action==LEFT){
			/*
			实现转向代码
			*/
			/*
			给变量重新赋值即可
			*/
			if(o){
				currentImg=heroImage[1][0];
				o = false;
			}else if(!o){
				currentImg=heroImage[1][1];
				o = true;
			}
			x=x-5;
			System.out.println("向左转");
			repaint();
		}else if(action==RIGHT){
			if(j){
				currentImg=heroImage[3][0];
				j = false;
			}else if(!j){
				currentImg=heroImage[3][2];
				j = true;
			}
			x=x+5;
			System.out.println("向右转");
			repaint();
		}else if(action==DOWN){
			if(k){
				currentImg=heroImage[0][0];
				k = false;
			}else if(!k){
				currentImg=heroImage[0][2];
				k = true;
			}
			y=y+5;
			System.out.println("向下转");
			repaint();
		}else if(action==UP){
			if(f){
				currentImg=heroImage[2][2];
				f = false;
			}else if(!f){
				currentImg=heroImage[2][1];
				f = true;
			}
			y=y-5;
			System.out.println("向上转");
			repaint();
		}
	}
}