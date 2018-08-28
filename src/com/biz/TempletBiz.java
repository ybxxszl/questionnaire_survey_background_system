package com.biz;

import java.util.List;

import com.vo.DictCheckbox;
import com.vo.DictCheckboxOption;
import com.vo.DictSingle;
import com.vo.DictSingleOption;
import com.vo.DictTemplet;
import com.vo.DictTempletIndex;
import com.vo.DictText;
import com.vo.PageBean;
import com.vo.Sort;

public interface TempletBiz {

	List<Sort> getSortList();

	void insertTemplet(
			String sortId,
			String dictTempletName,
			String[] single_question,
			String[] single_answer_A, String[] single_answer_B,
			String[] single_answer_C, String[] single_answer_D,
			String[] check_question,
			String[] check_answer_A, String[] check_answer_B,
			String[] check_answer_C, String[] check_answer_D,
			String[] check_answer_E, String[] check_answer_F,
			String[] text_question
	);

	PageBean getPageBean(String sortId, int page);

	List<DictTemplet> getTempletList(PageBean pageBean, String sortId);

	DictTemplet getDictTemplet(String dictTempletId);

	List<DictTempletIndex> getDictTempletIndexList(String dictTempletId);

	DictSingle getDictSingle(String dictExerciseId);

	DictCheckbox getDictCheckbox(String dictExerciseId);

	DictText getDictText(String dictExerciseId);

	List<DictSingleOption> getDictSingleOption(String dictSingleId);

	List<DictCheckboxOption> getDictCheckboxOption(String dictCheckboxId);

	void deleteTemplet(String dictTempletId);

}
