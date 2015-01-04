package stone.ast;

import java.util.Iterator;

public abstract class ASTree implements Iterable<ASTree> {
	public abstract ASTree child(int i);

	public abstract int numChildren();

	public abstract Iterator<ASTree> children();

	/**
	 * 返回一个 用于表示抽象语法树节点在程序内所处位置的字符串
	 * @return
	 */
	public abstract String location();

	public Iterator<ASTree> iterator() {
		return children();
	}
}
