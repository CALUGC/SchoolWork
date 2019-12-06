.386
.model flat, stdcall
.stack 4096

includelib Irvine32.lib
includelib legacy_stdio_definitions.lib
includelib ucrt.lib
include header.inc

.code
typeChange PROC
	push ebp
	mov ebp, esp

	mov esi, [ebp + 16]				; the offset of inputString
	mov ebx, [ebp + 12]				; the offset of stringLength

	sub esp, 12
	loopTime EQU DWORD PTR [ebp - 4]
	outputNum EQU SDWORD PTR [ebp - 8]
	reminder EQU DWORD PTR [ebp - 12]

	mov outputNum, 0
	mov eax, [ebx]
	mov loopTime, eax				; make ebx the number of stringLength
	mov ebx, -1
	changeWork:
		inc ebx
		cmp ebx, loopTime
		jge negativeCheck
		
		mov al, 0
		mov al, [esi + ebx]

		call IsDigit
		jnz checkNegative

		mov al, [esi + ebx]
		sub al, '0'
		mov ecx, outputNum
		imul ecx, 10
		mov outputNum, ecx
		add outputNum, eax
	jmp changeWork

	checkNegative:
		cmp eax, '-'
		je reminderChange
	jmp changeWork

	reminderChange:
		mov reminder, 1
	jmp changeWork

	negativeCheck:
		cmp reminder, 1
		jne getOut
		mov eax, outputNum
		neg eax
		mov outputNum, eax

	getOut:
		mov ecx, [ebp + 8]			; the offset of outputInt
		mov eax, outputNum
		mov [ecx], eax
		mov esp, ebp
		pop ebp
		ret
typeChange ENDP
END