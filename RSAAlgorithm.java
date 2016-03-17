
public class RSAAlgorithm {
	private HugeInt pNumber;
	private HugeInt qNumber;
	private HugeInt nNumber;
	private HugeInt eNumber;
	private HugeInt dNumber;
	private HugeInt phiNumber;
	private HugeInt publicKey;
	private HugeInt privateKey;
	
	public RSAAlgorithm(String p, String q) {
		pNumber = new HugeInt(p);
		qNumber = new HugeInt(q);
	}
	
	public HugeInt getPNumber() {
		return pNumber;
	}
	
	public HugeInt getQNumber() {
		return qNumber;
	}
	
	public HugeInt getNNumber() {
		return new HugeInt(pNumber.multiply(qNumber));
	}
	
	public HugeInt getENumber() {
		
		return null;
	}
	
	public HugeInt getDNumber() {
		
		return null;
	}
	
	public HugeInt getPhiNumber() {
		HugeInt qMinus1 = new HugeInt(pNumber.subtract(new HugeInt("1")));
		HugeInt pMinus1 = new HugeInt(pNumber.subtract(new HugeInt("1")));
		return new HugeInt(pMinus1.multiply(qMinus1));
	}
}
