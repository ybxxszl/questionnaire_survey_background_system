package com.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.TempletBiz;
import com.vo.DictCheckbox;
import com.vo.DictCheckboxOption;
import com.vo.DictSingle;
import com.vo.DictSingleOption;
import com.vo.DictTemplet;
import com.vo.DictTempletIndex;
import com.vo.DictText;
import com.vo.PageBean;
import com.vo.Sort;

@Controller
public class TempletControl {
	
	@Autowired
	private TempletBiz templetBiz;
	
	/**
	 * 加载问卷调查分类列表
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getSortList")
	public String getSortList(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
		
		System.out.println("迟来的web:getSortList请求。。。");
		
		List<Sort> list = templetBiz.getSortList();//获取问卷调查分类列表
		
		System.out.println("SortList:");
		for (Sort s : list) {
			System.out.println(s.toString());
		}
		
		session.setAttribute("list", list);
		
		return "insertTemplet.jsp";
		
	}
	
	/**
	 * 添加字典模板
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param single_question
	 * @param single_answer_A
	 * @param single_answer_B
	 * @param single_answer_C
	 * @param single_answer_D
	 * @param check_question
	 * @param check_answer_A
	 * @param check_answer_B
	 * @param check_answer_C
	 * @param check_answer_D
	 * @param check_answer_E
	 * @param check_answer_F
	 * @param text_question
	 * @return
	 */
	@RequestMapping(value = "/insertTemplet")
	public String insertTemplet(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String [] single_question, String [] single_answer_A, String [] single_answer_B, String [] single_answer_C, String [] single_answer_D, String [] check_question, String [] check_answer_A, String [] check_answer_B, String [] check_answer_C, String [] check_answer_D, String [] check_answer_E, String [] check_answer_F, String [] text_question) {
		
		System.out.println("迟来的web:insertTemplet请求。。。");
		
		String sortId = request.getParameter("sort");//获取分类ID
		String dictTempletName = request.getParameter("dictTempletName");//获取字典模板名称
		
		System.out.println("分类ID：" + sortId);
		System.out.println("字典模板名称：" + dictTempletName);
		System.out.println("单选题：");
		for (int i = 0; i < single_question.length; i++) {
			System.out.println("问题：" + single_question[i]);
			System.out.println("答案：A." + single_answer_A[i] + " B." + single_answer_B[i] + " C." + single_answer_C[i] + " D." + single_answer_D[i]);
		}
		System.out.println("多选题：");
		for (int i = 0; i < check_question.length; i++) {
			System.out.println("问题：" + check_question[i]);
			System.out.println("答案：A." + check_answer_A[i] + " B." + check_answer_B[i] + " C." + check_answer_C[i] + " D." + check_answer_D[i] + " E." + check_answer_E[i] + " F." + check_answer_F[i]);
		}
		System.out.println("文本题：");
		for (int i = 0; i < text_question.length; i++) {
			System.out.println("问题：" + text_question[i]);
		}
		
		templetBiz.insertTemplet(sortId, dictTempletName, single_question, single_answer_A, single_answer_B, single_answer_C, single_answer_D, check_question, check_answer_A, check_answer_B, check_answer_C, check_answer_D, check_answer_E, check_answer_F, text_question);
		
		return "index.jsp";
		
	}
	
	/**
	 * 获取模板分类和字典模板
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param sortId
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/showTempletList")
	public String showTempletList(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String sortId, int page, String action) {
		
		System.out.println("迟来的web:showTempletList请求。。。");
		
		System.out.println("选择分类：" + sortId + "  选择页：" + page);
		
		PageBean pageBean = templetBiz.getPageBean(sortId, page);//获取PageBean
		
		System.out.println("PageBean:" + pageBean.toString());
		
		List<DictTemplet> DictTempletList = templetBiz.getTempletList(pageBean, sortId);//获取内容DictTempletIndexList
		
		System.out.println("DictTempletList:");
		for (DictTemplet d : DictTempletList) {
			System.out.println(d.toString());
		}
		
		List<Sort> SortList = templetBiz.getSortList();//获取问卷调查分类列表
		
		System.out.println("SortList:");
		for (Sort s : SortList) {
			System.out.println(s.toString());
		}
		
		session.setAttribute("PageBean", pageBean);
		session.setAttribute("DictTempletList", DictTempletList);
		session.setAttribute("SortList", SortList);
		session.setAttribute("SortId", sortId);//传回当前分类id
		
		//判断执行的动作时是修改模板还是删除模板
		String temp = null;
		
		if(action.equals("modify")) {
			temp = "modifyTempletList.jsp";
		}
		if(action.equals("delete")) {
			temp = "deleteTempletList.jsp";
		}
		
		return temp;
		
	}
	
	/**
	 * 展示字典模板内容
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param dictTempletId
	 * @param dictTempletName
	 * @return
	 */
	@RequestMapping(value = "/showTemplet")
	public String showTemplet(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String dictTempletId) {
		
		System.out.println("迟来的web:showTemplet请求。。。");
		
		System.out.println("展示的字典模板ID：" + dictTempletId);
		
		DictTemplet dictTemplet = templetBiz.getDictTemplet(dictTempletId);
		
		String dictTempletName = dictTemplet.getDictTempletName();//获取字典模板名称
		
		System.out.println("展示的字典模板名称：" + dictTempletName);
		
		session.setAttribute("dictTempletName", dictTempletName);
		
		List<DictTempletIndex> dictTempletIndexList = templetBiz.getDictTempletIndexList(dictTempletId);//获取对应ID排序后的模板索引
		
		System.out.println("模板索引：");
		for (DictTempletIndex d : dictTempletIndexList) {
			System.out.println(d.toString());
		}
		
		List<DictSingle> dictSingleList = new ArrayList<DictSingle>();//存储单选题内容
		List<DictCheckbox> dictCheckboxList = new ArrayList<DictCheckbox>();//存储多选题内容
		List<DictText> dictTextList = new ArrayList<DictText>();//存储文本题内容
		
		for (int i = 0; i < dictTempletIndexList.size(); i++) {
			
			int DictTempletIndexSign = dictTempletIndexList.get(i).getDictTempletIndexSign();
			String dictExerciseId = dictTempletIndexList.get(i).getDictExerciseId();
			
			if(DictTempletIndexSign == 1){//判断为单选题
				
				DictSingle dictSingle = templetBiz.getDictSingle(dictExerciseId);//获取单选题内容
				dictSingleList.add(dictSingle);
				
			}
			if(DictTempletIndexSign == 2){//判断为多选题
				
				DictCheckbox dictCheckbox = templetBiz.getDictCheckbox(dictExerciseId);//获取多选题内容
				dictCheckboxList.add(dictCheckbox);
				
			}
			if(DictTempletIndexSign == 3){//判断为文本题
				
				DictText dictText = templetBiz.getDictText(dictExerciseId);//获取文本题内容
				dictTextList.add(dictText);
				
			}
			
		}
		
		if(dictSingleList.size() > 0) {
			System.out.println("共" + dictSingleList.size() + "道单选题，选项分别为：");
			for (DictSingle d : dictSingleList) {
				System.out.println(d.toString());
			}
		}
		
		if(dictCheckboxList.size() > 0) {
			System.out.println("共" + dictCheckboxList.size() + "道多选题，选项分别为：");
			for (DictCheckbox d : dictCheckboxList) {
				System.out.println(d.toString());
			}
		}
		
		if(dictTextList.size() > 0) {
			System.out.println("共" + dictTextList.size() + "道文本题，选项分别为：");
			for (DictText d : dictTextList) {
				System.out.println(d.toString());
			}
		}
		
		session.setAttribute("dictSingleList", dictSingleList);
		session.setAttribute("dictCheckboxList", dictCheckboxList);
		session.setAttribute("dictTextList", dictTextList);
		
		List<DictSingleOption> dictSingleOptionList = new ArrayList<DictSingleOption>();//存储单选题选项内容
		List<DictCheckboxOption> dictCheckboxOptionList = new ArrayList<DictCheckboxOption>();//存储多选题选项内容
		
		for (int i = 0; i < dictSingleList.size(); i++) {
			
			String dictSingleId = dictSingleList.get(i).getDictSingleId();
			
			List<DictSingleOption> list = templetBiz.getDictSingleOption(dictSingleId);
			
			dictSingleOptionList.addAll(list);
			
		}
		
		for (int i = 0; i < dictCheckboxList.size(); i++) {
			
			String dictCheckboxId = dictCheckboxList.get(i).getDictCheckboxId();
			
			List<DictCheckboxOption> list = templetBiz.getDictCheckboxOption(dictCheckboxId);
			
			dictCheckboxOptionList.addAll(list);
			
		}
		
		session.setAttribute("dictSingleOptionList", dictSingleOptionList);
		session.setAttribute("dictCheckboxOptionList", dictCheckboxOptionList);
		
		return "showTemplet.jsp";
		
	}
	
	@RequestMapping(value = "/modifyTemplet")
	public String modifyTemplet(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String dictTempletId) {
		
		System.out.println("迟来的web:modifyTemplet请求。。。");
		
		System.out.println("修改的字典模板ID：" + dictTempletId);
		
		DictTemplet dictTemplet = templetBiz.getDictTemplet(dictTempletId);
		
		String dictTempletName = dictTemplet.getDictTempletName();//获取字典模板名称
		String sortId = dictTemplet.getSortId();//获取字典模板分类ID
		
		System.out.println("修改的字典模板名称：" + dictTempletName);
		System.out.println("修改的字典模板分类ID：" + sortId);
		
		session.setAttribute("dictTempletName", dictTempletName);
		session.setAttribute("sortId", sortId);
		
		List<DictTempletIndex> dictTempletIndexList = templetBiz.getDictTempletIndexList(dictTempletId);//获取对应ID排序后的模板索引
		
		System.out.println("模板索引：");
		for (DictTempletIndex d : dictTempletIndexList) {
			System.out.println(d.toString());
		}
		
		List<DictSingle> dictSingleList = new ArrayList<DictSingle>();//存储单选题内容
		List<DictCheckbox> dictCheckboxList = new ArrayList<DictCheckbox>();//存储多选题内容
		List<DictText> dictTextList = new ArrayList<DictText>();//存储文本题内容
		
		for (int i = 0; i < dictTempletIndexList.size(); i++) {
			
			int DictTempletIndexSign = dictTempletIndexList.get(i).getDictTempletIndexSign();
			String dictExerciseId = dictTempletIndexList.get(i).getDictExerciseId();
			
			if(DictTempletIndexSign == 1){//判断为单选题
				
				DictSingle dictSingle = templetBiz.getDictSingle(dictExerciseId);//获取单选题内容
				dictSingleList.add(dictSingle);
				
			}
			if(DictTempletIndexSign == 2){//判断为多选题
				
				DictCheckbox dictCheckbox = templetBiz.getDictCheckbox(dictExerciseId);//获取多选题内容
				dictCheckboxList.add(dictCheckbox);
				
			}
			if(DictTempletIndexSign == 3){//判断为文本题
				
				DictText dictText = templetBiz.getDictText(dictExerciseId);//获取文本题内容
				dictTextList.add(dictText);
				
			}
			
		}
		
		if(dictSingleList.size() > 0) {
			System.out.println("共" + dictSingleList.size() + "道单选题，选项分别为：");
			for (DictSingle d : dictSingleList) {
				System.out.println(d.toString());
			}
		}
		
		if(dictCheckboxList.size() > 0) {
			System.out.println("共" + dictCheckboxList.size() + "道多选题，选项分别为：");
			for (DictCheckbox d : dictCheckboxList) {
				System.out.println(d.toString());
			}
		}
		
		if(dictTextList.size() > 0) {
			System.out.println("共" + dictTextList.size() + "道文本题，选项分别为：");
			for (DictText d : dictTextList) {
				System.out.println(d.toString());
			}
		}
		
		session.setAttribute("dictSingleList", dictSingleList);
		session.setAttribute("dictCheckboxList", dictCheckboxList);
		session.setAttribute("dictTextList", dictTextList);
		
		List<DictSingleOption> dictSingleOptionList = new ArrayList<DictSingleOption>();//存储单选题选项内容
		List<DictCheckboxOption> dictCheckboxOptionList = new ArrayList<DictCheckboxOption>();//存储多选题选项内容
		
		for (int i = 0; i < dictSingleList.size(); i++) {
			
			String dictSingleId = dictSingleList.get(i).getDictSingleId();
			
			List<DictSingleOption> list = templetBiz.getDictSingleOption(dictSingleId);
			
			dictSingleOptionList.addAll(list);
			
		}
		
		for (int i = 0; i < dictCheckboxList.size(); i++) {
			
			String dictCheckboxId = dictCheckboxList.get(i).getDictCheckboxId();
			
			List<DictCheckboxOption> list = templetBiz.getDictCheckboxOption(dictCheckboxId);
			
			dictCheckboxOptionList.addAll(list);
			
		}
		
		session.setAttribute("dictSingleOptionList", dictSingleOptionList);
		session.setAttribute("dictCheckboxOptionList", dictCheckboxOptionList);
		
		deleteTemplet(request, response, session, model, dictTempletId);//根据字典模板索引删除相应模板。。。
		
		return "modifyTemplet.jsp";
		
	}
	
	/**
	 * 删除字典模板
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param dictTempletId
	 * @return
	 */
	@RequestMapping(value = "/deleteTemplet")
	public String deleteTemplet(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, String dictTempletId) {
		
		System.out.println("迟来的web:deleteTemplet请求。。。");
		
		System.out.println("删除的字典模板ID：" + dictTempletId);
		
		templetBiz.deleteTemplet(dictTempletId);//根据字典模板索引删除相应模板。。。
		
		return "index.jsp";
		
	}

}
