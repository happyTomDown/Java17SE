package Unit6;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayList {
	private Object[] elems;
	private int next;

	public ArrayList(int capacity) {
		elems = new Object[capacity];
	}

	public ArrayList() {
		this(16);
	}

	public void add(Object o) {
		if (next == elems.length) {
			elems = Arrays.copyOf(elems, elems.length * 2);
		}
		elems[next++] = o;
	}

	public Object get(int index) {
		return elems[index];
	}

	public int size() {
		return next;
	}

	@Override
	public String toString() {
		var desc = new StringBuilder();
		desc.append("ArrayList{");
		int last = next - 1;
		for (int i = 0; i < last; i++) {
			desc.append(get(i)).append(",");
		}
		desc.append(get(last)).append("}");

		return desc.toString();

	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
		if(obj ==null|| getClass()!=obj.getClass()) {
			return false;
		}
		
        final var other = (ArrayList) obj;
        if(this.next!=other.next) {
        	return false;
        }
		return Arrays.equals(this.elems, other.elems);

	}

}
