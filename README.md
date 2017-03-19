# Compila17 compiler
## Contributors
- oddgfa - Odd Gunnar Fatland
- pavelju - Pavel Jurasek
- salihasa - Saliha Sajid

## Usage
Build using `ant build` and run using `ant run`.

## Design
We divided the nodes into three main parts: expressions, statements and declarations. The structure can be seen in the picture below.
![AST design][ast]

### Conflicts and solutions in grammars

## AST from Compila.cmp
```
(PROGRAM (NAME ComplexAddition)
	(CLASS_DECL (NAME Complex)
		(VAR_DECL (TYPE float) (NAME Real))
		(VAR_DECL (TYPE float) (NAME Imag))
	)
	(PROC_DECL (NAME Swap)
		(PARAM_DECL (TYPE (REF int)) (NAME a))
		(PARAM_DECL (TYPE (REF int)) (NAME b))

		(VAR_DECL (TYPE int) (NAME tmp))

		(ASSIGN_STMT
			(NAME tmp)
			(DEREF (NAME a))
		)
		(ASSIGN_STMT
			(DEREF (NAME a))
			(DEREF (NAME b))
		)
		(ASSIGN_STMT
			(DEREF (NAME b))
			(NAME tmp)
		)
	)
	(PROC_DECL (TYPE Complex) (NAME Add)
		(PARAM_DECL (TYPE Complex) (NAME a))
		(PARAM_DECL (TYPE Complex) (NAME b))

		(VAR_DECL (TYPE Complex) (NAME retval))

		(ASSIGN_STMT
			(NAME retval)
			(NEW (TYPE Complex))
		)
		(ASSIGN_STMT
			( . (NAME retval) (NAME Real))
			(ARIT_OP +
				( . (NAME a) (NAME Real))
				( . (NAME b) (NAME Real))
			)
		)
		(ASSIGN_STMT
			( . (NAME retval) (NAME Imag))
			(ARIT_OP +
				( . (NAME a) (NAME Imag))
				( . (NAME b) (NAME Imag))
			)
		)
		(RETURN_STMT (NAME retval))

	)
	(PROC_DECL (TYPE int) (NAME Max)
		(PARAM_DECL (TYPE int) (NAME a))
		(PARAM_DECL (TYPE int) (NAME b))

		(IF_STMT
			(REL_OP >
				(NAME a)
				(NAME b)
			)
			(
				(RETURN_STMT (NAME a))
			)
		)

		(RETURN_STMT (NAME b))

	)
	(PROC_DECL (NAME Main)
		(PROC_DECL (TYPE float) (NAME Square)
			(PARAM_DECL (TYPE float) (NAME val))

			(RETURN_STMT (ARIT_OP #
				(NAME val)
				(FLOAT_LITERAL 2.0)
			))

		)
		(VAR_DECL (TYPE float) (NAME num))

		(ASSIGN_STMT
			(NAME num)
			(FLOAT_LITERAL 6.48074)
		)
		(CALL_STMT (NAME print_float)
			(NAME num)
		)

		(CALL_STMT (NAME print_str)
			(STRING_LITERAL " squared is ")
		)

		(CALL_STMT (NAME print_float)
			(CALL_STMT (NAME Square)
				(NAME num)
			)

		)

		(RETURN_STMT)

	)
)
```

[ast]: https://scontent.flcy1-1.fna.fbcdn.net/v/t1.0-9/16998786_10202854026549374_6172743699134968588_n.jpg?oh=f6c5e250667e3a884c631beabfb0c223&oe=59287E53
