package chapter04;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/2/9 22:01
 * Project:EffectiveJava
 */
public interface SingerSongwriter extends Singer,SongWriter{
    AudioClip strum();
    void actSensitive();
}
