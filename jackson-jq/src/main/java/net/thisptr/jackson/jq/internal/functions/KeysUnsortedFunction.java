package net.thisptr.jackson.jq.internal.functions;

import com.google.auto.service.AutoService;

import net.thisptr.jackson.jq.Function;
import net.thisptr.jackson.jq.internal.BuiltinFunction;

@AutoService(Function.class)
@BuiltinFunction("keys_unsorted/0")
public class KeysUnsortedFunction extends AbstractKeysFunction {
	public KeysUnsortedFunction() {
		super("keys_unsorted", false);
	}
}
