package edu.yctc.genesis;

import edu.yctc.genesis.face.function.FaceFunction;
import edu.yctc.genesis.face.function.impl.FaceFunctionImpl;
import edu.yctc.genesis.face.util.CheckKnowledgeThread;
import edu.yctc.genesis.face.util.DealMedia;
import edu.yctc.genesis.face.util.Face;
import edu.yctc.genesis.face.util.OCRUtil;
import edu.yctc.genesis.service.StatisticalIService;
import edu.yctc.genesis.service.impl.StatisticalServiceImpl;
import org.springframework.context.annotation.Bean;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @version 创建时间：2018年4月25日 下午5:09:19
 * 类说明:测试类
 */
public class Test {

    public static void main(String[] args) {
//        DealMedia.setFrame("0.2");
//        DealMedia.setTotalTime("04:28");
//        DealMedia.decode("D:\\ffmpeg\\mp4\\亲子关系与小学生品德培养.mp4", "src\\img", "D:\\ffmpeg\\ffmpeg\\bin\\ffmpeg.exe");
        StatisticalIService statisticalIService=new StatisticalServiceImpl();
        statisticalIService.insert();
//        try {
//            //图片文件：此图片是需要被识别的图片路径
//            File file = new File("D://2.jpg");
//            //String recognizeText = new OCRHelper().recognizeText(file);
//            String recognizeText = new OCRUtil().recognizeText(file, "jpg");
//            System.out.print(recognizeText + "\t");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.prinStackTrace();
//        }

    }
}