package customException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class MoodAnalyserTest {

	//@Test
//	void test() {
//		fail("Not yet implemented");
//	}
@Test
	 public void giveNullMoodShouldThrowException() {
      MoodAnalayser moodAnalyser = new MoodAnalayser();
		try {
      
      moodAnalyser.analyserMood(null);
      } catch (MoodAnalyserException e) {
		Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
	}
	}
}

