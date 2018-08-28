package com.biz.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.TempletBiz;
import com.dao.DictCheckboxMapper;
import com.dao.DictCheckboxOptionMapper;
import com.dao.DictSingleMapper;
import com.dao.DictSingleOptionMapper;
import com.dao.DictTempletIndexMapper;
import com.dao.DictTempletMapper;
import com.dao.DictTextMapper;
import com.dao.SortMapper;
import com.vo.DictCheckbox;
import com.vo.DictCheckboxOption;
import com.vo.DictSingle;
import com.vo.DictSingleOption;
import com.vo.DictTemplet;
import com.vo.DictTempletIndex;
import com.vo.DictText;
import com.vo.PageBean;
import com.vo.Sort;

@Service
public class TempletBizimpl implements TempletBiz {

	@Autowired
	private SortMapper sortMapper;
	
	@Autowired
	private DictTempletMapper dictTempletMapper;
	
	@Autowired
	private DictTempletIndexMapper dictTempletIndexMapper;
	
	@Autowired
	private DictSingleMapper dictSingleMapper;
	
	@Autowired
	private DictSingleOptionMapper dictSingleOptionMapper;
	
	@Autowired
	private DictCheckboxMapper dictCheckboxMapper;
	
	@Autowired
	private DictCheckboxOptionMapper dictCheckboxOptionMapper;
	
	@Autowired
	private DictTextMapper dictTextMapper;
	
	private DictTemplet dictTemplet = new DictTemplet();
	private DictTempletIndex dictTempletIndex = new DictTempletIndex();
	private DictSingle dictSingle = new DictSingle();
	private DictSingleOption dictSingleOption = new DictSingleOption();
	private DictCheckbox dictCheckbox = new DictCheckbox();
	private DictCheckboxOption dictCheckboxOption = new DictCheckboxOption();
	private DictText dictText = new DictText();
	
	/**
	 * 加载全部问卷调查分类
	 */
	@Override
	public List<Sort> getSortList() {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getSortList请求。。。");
		
		List<Sort> list = sortMapper.selectByExample(new com.vo.SortExample());//获取全部问卷调查分类
		
		return list;
	}

	/**
	 * 存储字典模板
	 */
	@Override
	public void insertTemplet(
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
	) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:insertTemplet请求。。。");
		
		String dictTempletId = getUUID();
		
		dictTemplet.setDictTempletId(dictTempletId);
		dictTemplet.setDictTempletName(dictTempletName);
		dictTemplet.setSortId(sortId);
		
		dictTempletMapper.insert(dictTemplet);//存储字典模板表
		
		
		for (int i = 1; i < single_question.length; i++) {
			
			String dictSingleId = getUUID();
			String dictSingleContent = single_question[i];
			
			dictSingle.setDictSingleId(dictSingleId);
			dictSingle.setDictSingleContent(dictSingleContent);
			
			dictSingleMapper.insert(dictSingle);//存储字典单选表
			
			
			if(!single_answer_A[i].equals("-")) {
				
				insertDictSingleOption(1, dictSingleId, single_answer_A[i]);
				
			}
			
			if(!single_answer_B[i].equals("-")) {
				
				insertDictSingleOption(2, dictSingleId, single_answer_B[i]);
				
			}
			
			if(!single_answer_C[i].equals("-")) {
				
				insertDictSingleOption(3, dictSingleId, single_answer_C[i]);
				
			}
			
			if(!single_answer_D[i].equals("-")) {
				
				insertDictSingleOption(4, dictSingleId, single_answer_D[i]);
				
			}
			
			
			insertDictTempletIndex(1, i, dictTempletId, dictSingleId);
			
		}
		
		System.out.println("单选题存储完成");
		
		
		
		
		for (int i = 1; i < check_question.length; i++) {
			
			String dictCheckboxId = getUUID();
			String dictCheckboxContent = check_question[i];
			
			dictCheckbox.setDictCheckboxId(dictCheckboxId);
			dictCheckbox.setDictCheckboxContent(dictCheckboxContent);
			
			dictCheckboxMapper.insert(dictCheckbox);//存储字典多选表
			
			
			if(!check_answer_A[i].equals("-")) {
				
				insertDictCheckboxOption(1, dictCheckboxId, check_answer_A[i]);
				
			}
			
			if(!check_answer_B[i].equals("-")) {
							
				insertDictCheckboxOption(2, dictCheckboxId, check_answer_B[i]);
				
			}
						
			if(!check_answer_C[i].equals("-")) {
				
				insertDictCheckboxOption(3, dictCheckboxId, check_answer_C[i]);
				
			}
			
			if(!check_answer_D[i].equals("-")) {
				
				insertDictCheckboxOption(4, dictCheckboxId, check_answer_D[i]);
				
			}
			
			if(!check_answer_E[i].equals("-")) {
				
				insertDictCheckboxOption(5, dictCheckboxId, check_answer_E[i]);
				
			}
			
			if(!check_answer_F[i].equals("-")) {
				
				insertDictCheckboxOption(6, dictCheckboxId, check_answer_F[i]);
				
			}
			
			
			insertDictTempletIndex(2, i, dictTempletId, dictCheckboxId);
			
		}
		
		System.out.println("多选题存储完成");
		
		
		
		
		for (int i = 1; i < text_question.length; i++) {
			
			String dictTextId = getUUID();
			String dictTextContent = text_question[i];
			
			dictText.setDictTextId(dictTextId);
			dictText.setDictTextContent(dictTextContent);
			
			dictTextMapper.insert(dictText);//存储字典文本表
			
			
			insertDictTempletIndex(3, i, dictTempletId, dictTextId);
			
		}
		
		System.out.println("文本题存储完成");
		
	}

	
	private void insertDictSingleOption(int dictSingleOrder, String dictSingleId, String dictSingleOptionContent) {
		// TODO Auto-generated method stub
		dictSingleOption.setDictSingleOptionId(getUUID());
		dictSingleOption.setDictSingleId(dictSingleId);
		dictSingleOption.setDictSingleOrder(dictSingleOrder);
		dictSingleOption.setDictSingleOptionContent(dictSingleOptionContent);
		
		dictSingleOptionMapper.insert(dictSingleOption);
		
	}//存储字典单选选项表
	
	
	private void insertDictCheckboxOption(int dictCheckboxOrder, String dictCheckboxId, String dictCheckboxOptionContent) {
		// TODO Auto-generated method stub
		dictCheckboxOption.setDictCheckboxOptionId(getUUID());
		dictCheckboxOption.setDictCheckboxId(dictCheckboxId);
		dictCheckboxOption.setDictCheckboxOrder(dictCheckboxOrder);
		dictCheckboxOption.setDictCheckboxOptionContent(dictCheckboxOptionContent);
		
		dictCheckboxOptionMapper.insert(dictCheckboxOption);
		
	}//存储字典多选选项表
	
	
	private void insertDictTempletIndex(int dictTempletIndexSign, int dictTempletIndexOrder, String dictTempletId, String dictTextId) {
		// TODO Auto-generated method stub
		dictTempletIndex.setDictTempletIndexId(getUUID());
		dictTempletIndex.setDictTempletIndexSign(dictTempletIndexSign);
		dictTempletIndex.setDictTempletIndexOrder(dictTempletIndexOrder);
		dictTempletIndex.setDictTempletId(dictTempletId);
		dictTempletIndex.setDictExerciseId(dictTextId);
		
		dictTempletIndexMapper.insert(dictTempletIndex);
		
	}//存储字典模板索引表

	
	public String getUUID() {
		
		UUID uuid = UUID.randomUUID();//获取UUID
		String temp = uuid.toString();
		
		return temp;
		
	}//获取字符串类型的UUID

	/**
	 * 获取PageBean
	 */
	@Override
	public PageBean getPageBean(String sortId, int page) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getPageBean请求。。。");
		
		com.vo.DictTempletExample example = new com.vo.DictTempletExample();
		com.vo.DictTempletExample.Criteria criteria = example.createCriteria();
		
		criteria.andSortIdEqualTo(sortId);//获取对应分类下模板条数
		
		int totalItem = dictTempletMapper.countByExample(example);//获取总条数
		
		PageBean pageBean = new PageBean();//保存PageBean
		
		pageBean.setPage(page);
		pageBean.setTotalItem(totalItem);
		pageBean.setTotalPage();
		
		return pageBean;
	}

	/**
	 * 获取内容TemplateList
	 */
	@Override
	public List<DictTemplet> getTempletList(PageBean pageBean, String sortId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getTempletList请求。。。");
		
		int start = (pageBean.getPage() - 1) * pageBean.getItem();//内容开始
		int end = pageBean.getTotalItem() < pageBean.getPage() * pageBean.getItem() ? pageBean.getTotalItem() : pageBean.getPage() * pageBean.getItem();//内容结束
		
		System.out.println("内容开始:" + start + "    " + "内容结束:" + end);
		
		com.vo.DictTempletExample example = new com.vo.DictTempletExample();
		com.vo.DictTempletExample.Criteria criteria = example.createCriteria();
		
		criteria.andSortIdEqualTo(sortId);//获取对应分类下模板内容
		
		List<DictTemplet> list = dictTempletMapper.selectByExample(example);//获取全部内容
		
		List<DictTemplet> l = new ArrayList<DictTemplet>();
		for (int i = start; i < end; i++) {
			l.add(list.get(i));//获取每页显示内容
		}
		
		return l;
	}

	/**
	 * 获取字典模板名称
	 */
	@Override
	public DictTemplet getDictTemplet(String dictTempletId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictTemplet请求。。。");
		
		DictTemplet dictTemplet = dictTempletMapper.selectByPrimaryKey(dictTempletId);
		
		return dictTemplet;
	}

	/**
	 * 获取字典模板索引
	 */
	@Override
	public List<DictTempletIndex> getDictTempletIndexList(String dictTempletId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictTempletIndexList请求。。。");
		
		List<DictTempletIndex> list = dictTempletIndexMapper.selectByDictTempletIndexIdOrderByDictTempletIndexSignDictTempletIndexOrder(dictTempletId);//获取对应ID排序后的模板索引
		
		return list;
	}

	/**
	 * 获取字典模板单选题
	 */
	@Override
	public DictSingle getDictSingle(String dictExerciseId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictSingle请求。。。");
		
		DictSingle dictSingle = dictSingleMapper.selectByPrimaryKey(dictExerciseId);
		
		return dictSingle;
	}

	/**
	 * 获取字典模板多选题
	 */
	@Override
	public DictCheckbox getDictCheckbox(String dictExerciseId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictCheckbox请求。。。");
		
		DictCheckbox dictCheckbox = dictCheckboxMapper.selectByPrimaryKey(dictExerciseId);
		
		return dictCheckbox;
	}

	/**
	 * 获取字典模板文本题
	 */
	@Override
	public DictText getDictText(String dictExerciseId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictText请求。。。");
		
		DictText dictText = dictTextMapper.selectByPrimaryKey(dictExerciseId);
		
		return dictText;
	}

	/**
	 * 获取字典模板单选题选项
	 */
	@Override
	public List<DictSingleOption> getDictSingleOption(String dictSingleId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictSingleOption请求。。。");
		
		List<DictSingleOption> list = dictSingleOptionMapper.selectBydictSingleIdOrderbydictSingleOrder(dictSingleId);
		
		return list;
	}

	/**
	 * 获取字典模板多选题选项
	 */
	@Override
	public List<DictCheckboxOption> getDictCheckboxOption(String dictCheckboxId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:getDictCheckboxOption请求。。。");
		
		List<DictCheckboxOption> list = dictCheckboxOptionMapper.selectBydictCheckboxIdOrderbydictCheckboxOrder(dictCheckboxId);
		
		return list;
	}

	/**
	 * 删除相应字典模板及内容
	 */
	@Override
	public void deleteTemplet(String dictTempletId) {
		// TODO Auto-generated method stub
		System.out.println("迟来的biz:deleteTemplet请求。。。");
		
		int deleteDictSingleNum = 0;//统计删除单选题数量
		int deleteDictCheckboxNum = 0;//统计删除多选题数量
		int deleteDictTextNum = 0;//统计删除文本题数量
		
		com.vo.DictTempletIndexExample dictTempletIndexExample = new com.vo.DictTempletIndexExample();
		com.vo.DictTempletIndexExample.Criteria dictTempletIndexExampleCriteria = dictTempletIndexExample.createCriteria();
		dictTempletIndexExampleCriteria.andDictTempletIdEqualTo(dictTempletId);//根据模板ID查找模板索引
		
		List<DictTempletIndex> dictTempletIndexList = dictTempletIndexMapper.selectByExample(dictTempletIndexExample);//获取字典模板索引
		
		for (DictTempletIndex dictTempletIndex : dictTempletIndexList) {//根据dictExerciseId删除单选题、多选题、文本题
			
			com.vo.DictSingleOptionExample dictSingleOptionExample = new com.vo.DictSingleOptionExample();
			com.vo.DictSingleOptionExample.Criteria dictSingleOptionExampleCriteria = dictSingleOptionExample.createCriteria();
			dictSingleOptionExampleCriteria.andDictSingleIdEqualTo(dictTempletIndex.getDictExerciseId());//根据dictSingleId删除单选题选项
			
			com.vo.DictCheckboxOptionExample dictCheckboxOptionExample = new com.vo.DictCheckboxOptionExample();
			com.vo.DictCheckboxOptionExample.Criteria dictCheckboxOptionExampleCriteria = dictCheckboxOptionExample.createCriteria();
			dictCheckboxOptionExampleCriteria.andDictCheckboxIdEqualTo(dictTempletIndex.getDictExerciseId());//根据dictCheckboxId删除多选题选项
			
			dictSingleOptionMapper.deleteByExample(dictSingleOptionExample);//删除单选题选项
			
			dictCheckboxOptionMapper.deleteByExample(dictCheckboxOptionExample);//删除多选题选项
			
			deleteDictSingleNum =+ dictSingleMapper.deleteByPrimaryKey(dictTempletIndex.getDictExerciseId());//删除单选题
			
			deleteDictCheckboxNum =+ dictCheckboxMapper.deleteByPrimaryKey(dictTempletIndex.getDictExerciseId());//删除多选题
			
			deleteDictTextNum =+ dictTextMapper.deleteByPrimaryKey(dictTempletIndex.getDictExerciseId());//删除文本题
			
		}
		
		System.out.println("删除单选题数量：" + deleteDictSingleNum);
		System.out.println("删除多选题数量：" + deleteDictCheckboxNum);
		System.out.println("删除文本题数量：" + deleteDictTextNum);
		
		dictTempletIndexMapper.deleteByExample(dictTempletIndexExample);//删除字典模板索引
		
		dictTempletMapper.deleteByPrimaryKey(dictTempletId);//删除字典模板
		
	}

}