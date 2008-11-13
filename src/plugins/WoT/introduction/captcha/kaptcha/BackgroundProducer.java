package plugins.WoT.introduction.captcha.kaptcha;

import java.awt.image.BufferedImage;

/**
 * {@link BackgroundProducer} is responsible for adding background to an image.
 */
public interface BackgroundProducer
{
	public abstract BufferedImage addBackground(BufferedImage image);
}
