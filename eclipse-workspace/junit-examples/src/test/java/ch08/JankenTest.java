package ch08;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

import java.util.Objects;

import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import ch08.Janken.Hand;
import ch08.Janken.Result;

@RunWith(Theories.class)
public class JankenTest {

	//SUT - テスト対象システム
	private Janken sut;
	
	//Parameter1
	@DataPoint
	public static Hand parameter1 = Hand.GU;
	
	//Parameter2
	@DataPoint
	public static Hand parameter2 = Hand.TYOKI;
	
	//Parameter3
	@DataPoint
	public static Hand parameter3 = Hand.PA;
	
	@Before
	public void setUp() {
		//SetUp - 初期化
		this.sut = new Janken();
	}
	
	@Theory
	public void testJudgeDraw(Hand paramA, Hand paramB) throws Exception {
		
		//Exercise - テスト実行
		System.out.println(paramA);
		System.out.println(paramB);
		Result actual = this.sut.judge(paramA, paramB);
		
		//Verify - 検証
		assumeTrue(Objects.equals(paramA, paramB));
		assertThat(actual, is(Result.DRAW));
		
	}

	@Theory
	public void testJudgeWin(Hand paramA, Hand paramB) throws Exception {
		
		//Exercise - テスト実行
		System.out.println(paramA);
		System.out.println(paramB);
		Result actual = this.sut.judge(paramA, paramB);
		
		//Verify - 検証	
		assumeTrue(Hand.TYOKI.toString().equals(paramA.name()) && Hand.PA.toString().equals(paramB.name()));
		assertThat(actual, is(Result.WIN));
		
	}
	
	@Theory
	public void testJudgeLose(Hand paramA, Hand paramB) throws Exception {
		
		//Exercise - テスト実行
		System.out.println(paramA);
		System.out.println(paramB);
		Result actual = this.sut.judge(paramA, paramB);
		
		//Verify - 検証
		assumeTrue("PA".equals(paramA.name()) && "TYOKI".equals(paramB.name()));
		assertThat(actual, is(Result.LOSE));
		
	}
	
}
